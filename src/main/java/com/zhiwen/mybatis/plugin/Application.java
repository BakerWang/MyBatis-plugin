package com.zhiwen.mybatis.plugin;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * @author weizhiwen
 */
public class Application {

  public static void main(String[] args)
      throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
    KeyGenerator kengen = new KeyGenerator();
    kengen.generator();
  }

}
