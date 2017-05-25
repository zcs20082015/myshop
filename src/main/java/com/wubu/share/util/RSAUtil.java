package com.wubu.share.util;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.log4j.Logger;

/**
 * <p>Title: RSAUtil </p>
 * <p>Description: RSA签名公共类</p>
 * <p>Company: http://www.uubee.com/ </p>
 * @author liuzhy@uubee.com
 * @date 2015-8-28 下午3:42:04
 */
public class RSAUtil{

    private static Logger  log = Logger.getLogger(RSAUtil.class);
    private static RSAUtil instance;

    private RSAUtil(){

    }

    public static RSAUtil getInstance()
    {
        if (null == instance)
            return new RSAUtil();
        return instance;
    }

   
    /**
     * 签名处理
     * @param prikeyvalue：私钥文件
     * @param sign_str：签名源内容
     * @return
     */
    public static String sign(String prikeyvalue, String sign_str)
    {
        try
        {
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(Base64
                    .getBytesBASE64(prikeyvalue));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PrivateKey myprikey = keyf.generatePrivate(priPKCS8);
            // 用私钥对信息生成数字签名
            java.security.Signature signet = java.security.Signature
                    .getInstance("SHA1withRSA");
            signet.initSign(myprikey);
            signet.update(sign_str.getBytes("UTF-8"));
            byte[] signed = signet.sign(); // 对信息的数字签名
            return new String(org.apache.commons.codec.binary.Base64.encodeBase64(signed));
        } catch (java.lang.Exception e)
        {
            log.error("签名异常" , e);
        }
        return null;
    }

    /**
     * 签名验证
     * @param pubkeyvalue：公钥
     * @param oid_str：源串
     * @param signed_str：签名结果串
     * @return
     */
    public static boolean checksign(String pubkeyvalue, String oid_str,
            String signed_str)
    {
        try
        {
            X509EncodedKeySpec bobPubKeySpec = new X509EncodedKeySpec(Base64
                    .getBytesBASE64(pubkeyvalue));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey pubKey = keyFactory.generatePublic(bobPubKeySpec);
            byte[] signed = Base64.getBytesBASE64(signed_str);// 这是SignatureData输出的数字签名
            java.security.Signature signetcheck = java.security.Signature
                    .getInstance("SHA1withRSA");
            signetcheck.initVerify(pubKey);
            signetcheck.update(oid_str.getBytes("UTF-8"));
            return signetcheck.verify(signed);
        } catch (java.lang.Exception e)
        {
            log.error("签名验证异常", e);
        }
        return false;
    }

/*    public static void main(String[] args)
    {
        // 商户（RSA）私钥 TODO 强烈建议将私钥
        //String RSA_PRIVATE ="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALkJ/BrjnYv6tysAGawJPYRGHEZw0JvoRnWF+zkQbsddrd6G/IMsLnlQ/+iufRkuKn4FffQOROXk+byGsBem0cgjsIGRNf9MTY9YQvwF+H92Qh1GZaZxe9u0S/x5THcdqc5gCR+F7vQYlr24Hz8OCVUbIrAz0w3JDzcIT+CLjHTVAgMBAAECgYAiSDVLDgysWIEDGHupIfUhwpOOgWxE1l3nfDE1O1Qq37JM3hl+e/sIQveGtn064xDAVGgnhVVCeo/CW/nYB/Ipn6XJxVDCUk6wPvejfPTASJkvJRQZDOj9VFbmPz6NHxb/CLWbtVMNN9E9m6+mH7N5BWsy9lQw02/w8QxeotElaQJBAORJWSgVEOTQ1EtntpTr0H5V6RkVoPlYGnvQ5jjvDG0W3iPjHzV56tvAjv5nT9fYvnyrUfSkog+0JG49r5EMwxsCQQDPgJjkCUho5k6PXjE7EeLZMZM3qN2vFVQQCYRZJIZb+64qFk5Y1R/ynKLAWr9zC9hW8fvWXs4RIfg55q5RaTbPAkB5UTF8R5Wuw/vOBtPU2Gz4dpdlqUTevZ91ZVKztvYXkyuCTtTrCltxZSeYszaPMrQodLMdG9C0H7usikOfBfU5AkEAs0XKUfHHMoIPy4O4iu1IDRfstgDaDkMiDnz6cD3DK0NFVK1S4SK46FX1srR0hYPtVCjayHm+FUVA/V1Uq5d4NwJASnLTecLoUDZEewEWdEc46Z/7vzraBGMt59Zfg0jvn3xJPgxLRDL7wyaMcH62udICNy3g4T4cth/FJBZha3KimA==";
    	  String RSA_PRIVATE ="MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMb44K/t1wJ1yEKiFIlbOBg35MkkLYg21A14t0ENRXj4q4eeakqFs4QS4ds9Zb6jMQZxlj6iZ7UCT7j9VRUyyEMliwY7YARjuj3NcnSscobKfij81Aw0lazvSbCMdENib36nY4LHhMVpmyKQlLyEI9ccAQfYnkujxE7XYrN61QcTAgMBAAECgYEAlE6To26DUdka8NfAuPUeJacbx/VIXvyHKJdu+HT88INhz0976JopyWsNoA3ulZ8r/qKRm5QP+vKDG97wGUHl1B5nJTA6+n/GfCZNullf2SdM2O3m3v3y59QcX9pcLeqWgnF2wob92jynuB5ciMkhBclAZn0aSUZ2L/Q0o0Hb7ykCQQDiB9NbHLVwPFBymi7VclC0gBRoKEWjLOI42v7YcdM32tWMJrwg/hQJSDBb+54pGLmxF6ZBm52z1KZfer9ivhYtAkEA4VqbXKdj65QgfSfqqEzqbmbvFH3CFpRr3LmFK2rV4hRX5cglRYPBxYVfa4LocRN5Y7Bmrl/ZzX9cBr9AlCEaPwJBAKunu8inDdfVxlayZzzsmwPpfRX496HLlWYOUpo4H2t8ws60IA2CR98gtrE0btHRGDy4tCeBMgv/Q/ag9rXbnGUCQQC1EYpXrh+4/7IDHfmL9RFAV/CttEYowmTQWzhHJHZqSxI9DM31xuIBBSMgTXTatl0I3ooCff2RAk49FZqb6uUdAkAY2X9TPBci/SjJfshCmsDG7XYkHYH+Am1dQ3/4BX8YZ5c0E8Lt7xj3oypkLj38WluG4xe2OB6y1znroVPiwc7N";
        // 有贝支付（RSA）公钥
       // String RSA_YT_PUBLIC ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5Cfwa452L+rcrABmsCT2ERhxGcNCb6EZ1hfs5EG7HXa3ehvyDLC55UP/orn0ZLip+BX30DkTl5Pm8hrAXptHII7CBkTX/TE2PWEL8Bfh/dkIdRmWmcXvbtEv8eUx3HanOYAkfhe70GJa9uB8/DglVGyKwM9MNyQ83CE/gi4x01QIDAQAB";
    	  String RSA_YT_PUBLIC ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDG+OCv7dcCdchCohSJWzgYN+TJJC2INtQNeLdBDUV4+KuHnmpKhbOEEuHbPWW+ozEGcZY+ome1Ak+4/VUVMshDJYsGO2AEY7o9zXJ0rHKGyn4o/NQMNJWs70mwjHRDYm9+p2OCx4TFaZsikJS8hCPXHAEH2J5Lo8RO12KzetUHEwIDAQAB";
        String sign = RSAUtil.sign(RSA_PRIVATE, "acct_balance=116.96&bal_credit=116.96&mob_user=13251000804&oid_partner=2015042800022589&sign_type=RSA&user_id=13251000804");
        System.out.println(sign);
        System.out.println(RSAUtil.checksign(RSA_YT_PUBLIC, "acct_balance=116.96&bal_credit=116.96&mob_user=13251000804&oid_partner=2015042800022589&sign_type=RSA&user_id=13251000804", sign));
    }*/
}
