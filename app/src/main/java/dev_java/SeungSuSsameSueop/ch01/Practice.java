package dev_java.SeungSuSsameSueop.ch01;

public class Practice {
        private String name; // 붕어빵의 이름
        private int flour; // 밀가루반죽의 양
        private int redbean; // 팥의 양
        // Constructor

        public Practice(String iname, int iflour, int iredbean) {
                name = iname;
                flour = iflour;
                redbean = iredbean;
                bake();
        }

        // memeber method
        public void bake() {
                System.out.println(name + " 붕어빵이 만들어 졌습니다.");

        }
}

public class Practice {

public static void main(String[] args){

                // 붕어빵틀에 밀가루반죽과 팥을 넣고 굽습니다.

                FishBreadTool a = new FishBreadTool("덕수붕어",2,3);

                FishBreadTool b = new FishBreadTool("준훈붕어",2,2);

                FishBreadTool c = new FishBreadTool("풍석붕어",3,3);

                FishBreadTool d = new FishBreadTool("진영붕어",2,2);

                FishBreadTool e = new FishBreadTool("현진붕어",2,1);

                FishBreadTool f = new FishBreadTool("진희붕어",1,1);
