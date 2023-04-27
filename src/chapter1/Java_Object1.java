package chapter1;

public class Java_Object1 {
    public static void main(String[] args) {
        // 问题：做一道菜，红烧排骨
        // 类：菜，  对象：红烧排骨

        // TODO 1. 先声明类
        // TODO 2. 创建对象
        // TODO 3. 声明属性，所谓的属性其实就是类中的变量
        //         变量类型  变量名称  =  变量值
        //         属性类型  属性名称  =  属性值
        // TODO 4. 声明方法
        //         void 方法名 (参数) { 功能代码 }
        // TODO 5. 执行方法
        //         对象.属性
        //         对象.方法名()

        // 引用数据类型
        Cooking c = new Cooking();
        c.name = "红烧排骨";
        c.food = "排骨";
        c.execute();

        Cooking d = new Cooking();
        d.name = "红烧鱼";
        d.food = "鱼";
        d.execute();
    }
}

class Cooking {
    // 特征（属性）
    // 名字
    String name;
    // 菜的类型
    String type = "红烧";
    // 食材
    String food;
    // 佐料
    String relish = "大料";

    void execute() {
        System.out.println("准备食材：" + food);
        System.out.println("准备佐料：" + relish);
        System.out.println("开始烹饪");
        System.out.println(name + "烹饪完成");
    }
}
