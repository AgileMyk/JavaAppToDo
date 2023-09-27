public abstract class ToDoTask {

        private int eventCount;
        private String name;
        private String category;
        private String priority;
        private int totalTasks;
        private double sessionTime;
        private String color;

        public abstract void setTimer();
        public abstract void startTimer();
        public abstract void pausetimer();

        public void setEventCount() {
                eventCount = 0;
        }
        public ToDoTask(String name, String category, String priority, int totalTasks, double sessionTime, String color) {
            this.name = name;
        }

        public abstract void add();

}
