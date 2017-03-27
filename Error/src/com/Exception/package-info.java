/**
 * 
 */
/**
 * @author ghostclock
 *
 */

/**
 * 异常的分类:
 * 1.检查性异常 java.lang.Exception
 * 2.运行期异常 java.lang.RuntimeException
 * 3.错误 java.lang.Error
 * 
 * 顶层是java.lang.Throwable类,检查性,运行期异常,错误都是这个类的子孙类,
 * java.lang.Exception和java.lang.Error继承自java.lang.Throwable,
 * 而java.lang.RuntimeException继承自java.lang.Exception
 * */
/**
 * 检查性异常:
 * 程序正确,但是因为外在的环境条件不满足而引发
 * 
 * 运行期异常:意味着程序存在bug,如数组越界
 * 
 * 错误:一般很少见,也很难通过程序解决,他可能源于程序的bug,一般更可能为环境
 * 
 * */

package com.Exception;