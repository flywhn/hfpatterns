# hfpatterns
learning patterns by head first

#策略模式 Strategy Pattern
定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

#工厂模式



#单例模式 Singleton Pattern
确保一个类只有一个实例，并提供全局访问点。


principles :

找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起。

把会变化的部分取出并“封装”起来，好让其他部分不会受到影响。


针对接口编程，而不是针对实现编程。关键在于利用“多态”，实现动态绑定。
/*
	针对实现编程
	Dog d = new Dog();
	d.bark();
*/

// 针对接口/超类型编程

	Animal animal = new Dog();
	animal.makeSound();


多用组合，少用继承
