/**
 * 
 */
/**
 * @author ghostclock
 * 绘图技术
 * 
 */
/**
 * 绘图的原理:
 * Component类提供了两个和绘图相关的重要方法
 * 1.paint(Graphics g)绘制组件的外观
 * 2.repaint()刷新组件的外观
 * 
 * 当组件第一次在屏幕显示的时候,程序会自动的调用paint()方法来绘制组件
 * */

/**
 * 在以下的情况下paint()将会被调用
 * 1.窗口最小化，最大化
 * 2.窗口大小发生变化
 * 3.repaint函数被调用
 * 
 * */


package com.test01;