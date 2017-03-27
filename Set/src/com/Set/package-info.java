/**
 * @author ghostclock
 * Java中集合类主要有以下几种
 * 
 * List结构的集合类
 * ArrayList类,LinkedList类,Vector类,Stack类
 *
 * Map结构的集合类
 * HashMap类,Hashtable类
 * 
 * Set结构的集合类
 * HashSet类,TreeSet类
 * 
 * Queue结构的集合类
 * Queue接口
 *
 */

/**
 * ArrayList和Vector的区别
 * ArrayList与Vector都是Java的集合类,都可以用来存放java的对象,这是他们的共同点
 * 区别:
 * 1.同步性:
 * Vector是同步的，这个类中的一些方法保证了Vector中的对象是线程安全的，
 * 而ArrayList则是异步的,因此ArrayList中的对象并不是线程安全的
 * 
 * 2.数据增长:
 * 从内部实现机制来讲ArrayList和Vector都是使用数组(Array)来控制集合中的对象,当你向这两种类型中增加元素的时候,
 * 如果元素的数目超出了内部数组目前的长度他们都需要扩展内部数组的长度,Vertor缺省情况下自动增长原来一倍的数组长度,
 * ArrayList是原来的50%,所以最后你获取的这个集合所占的空间总是比你实际需要的大,所以如果要在集合中保存大量的数据,
 * 那么用Vector有一些优势，因为可以通过设置集合的初始化大小来避免不必要的资源开销
 * 
 * */

/**
 * HashMap和Hashtable的区别
 * HashMap与Hashtable都是java的集合类,都可以用来存放java的对象,这也是他们的相同点
 * 区别是:
 * 1.历史原因:
 * Hashtable是基于陈旧的Dictionary类的,HashMap是Java1.2引进的Map接口的一个实现
 * 2.同步性
 * Hashtable是同步的,这个类中的一些方法保证了Hashtable中的对象是线程安全的,而HashMap则是异步的,
 * 因此HsahMap中的对象并不是线程安全的,因为同步的要求会影响执行的效率,所以如果你不需要线程安全的集合,
 * 那么使用HashMap是很好的选择,这样可以避免由于同步带来的不必要的性能开销,从而提高效率
 * 3.值
 * HashMap可以让你将空值作为一个 表的条目的key或者value,但是HashTable是不能放入空值的（null）
 * 
 * */

package com.Set;
