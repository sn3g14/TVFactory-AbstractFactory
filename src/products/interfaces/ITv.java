/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products.interfaces;

/**
 *
 * @author Adam
 */
public interface ITv {
  public String on();
  public String off();

  /**
   *
   * @param value the value of value
   */
  public String increaseVolume(int value);
  
  /**
   *
   * @param value the value of value
   */
  public String decreaseVolume(int value);  
}
