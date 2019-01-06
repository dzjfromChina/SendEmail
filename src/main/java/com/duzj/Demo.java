package com.duzj;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

import java.util.ArrayList;

/**
 * @author duzj
 * @create 2018-08-09 14:22
 */
public class Demo {

    public static void main(String[] args) {
        MailAccount account = new MailAccount();
        account.setHost("smtp.163.com");
        account.setAuth(true);
        account.setPort(465);
        account.setFrom("你的邮箱账号");
        account.setUser("你的邮箱账号");
        account.setPass("你的邮箱密码/授权码");
        account.isStartttlsEnable();
        account.setSslEnable(true);
        account.setSocketFactoryClass("javax.net.ssl.SSLSocketFactory");
        account.setSocketFactoryFallback(true);
        account.setSocketFactoryPort(465);
        ArrayList<String> tos = CollUtil.newArrayList("接收人邮箱账号");//收件人
        MailUtil.send(account,tos, "主题", "ok", true);
    }
}
