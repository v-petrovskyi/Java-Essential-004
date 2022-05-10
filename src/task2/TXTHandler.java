package task2;

class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("you open TXT file");
    }

    @Override
    void create() {
        System.out.println("you create TXT file");
    }

    @Override
    void change() {
        System.out.println("you change TXT file");
    }

    @Override
    void save() {
        System.out.println("you save TXT file");
    }
}
