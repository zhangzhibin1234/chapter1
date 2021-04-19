package com.designPattern.visitor;
/**
 * @author:zzb
 * @desc: Visitor模式也叫访问者模式，是行为模式之一
 * ，它分离对象的数据和行为，使用Visitor模式，
 * 可以不修改已有类的情况下，增加新的操作。   比如有一个公园，有一到多个不同的组成部分；该公
 * 园存在多个访问者：清洁工A负责打扫公园的A部分，清
 * 洁工B负责打扫公园的B部分，公园的管理者负责检点各
 * 项事务是否完成，上级领导可以视察公园等等。也就是
 * 说，对于同一个公园，不同的访问者有不同的行为操
 * 作，而且访问者的种类也可能需要根据时间的推移而变
 * 化（行为的扩展性）
 * @date:20:43 2021/4/19
 * @param:
 * @return:
 **/
public class MainClass {
	public static void main(String[] args) {
		Park park = new Park();
		park.setName("越秀公园");
		VisitorA visitorA = new VisitorA();

		park.accept(visitorA);

		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);

		VisitorManager visitorManager = new VisitorManager();
		park.accept(visitorManager);
	}
}
