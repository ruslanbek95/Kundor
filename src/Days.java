public enum Days {
    MONDAY{
        @Override
        public void metod() {
            System.out.println("Дуйшонбу куну java окуйм");
        }
    },
    TUSDAY{
        @Override
        public void metod() {
            System.out.println("Шейшемби куну кайталоо практика ");
        }
    },
    WENSDAY{
        @Override
        public void metod() {
            System.out.println(" шаршеньи куну жаны тема ");

        }
    },
    FRIDAY{
        @Override
        public void metod() {
            System.out.println("бейшенби куну практика куну ");

        }
    },
    SATURDAY{
        @Override
        public void metod() {
            System.out.println("жума куну жумма намаз окуулат ");

        }
    },
    SUNDAY{
        @Override
        public void metod() {
            System.out.println("акыркы практика куну ");

        }
    };
    public abstract void metod();

};
