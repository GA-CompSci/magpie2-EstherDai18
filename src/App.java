public class App {

    private Horse[] Barns;{ 
    Barns[0] = new Horse("Hydrogen");
    Barns[1] = new Horse("Helium");
    Barns [2] = new Horse("Lithium");
    Barns [3] = null;
    Barns [4] = new Horse("Carbon");
    Barns [5] = new Horse("Copper");
    System.out.println(findHorseSpace("Carbon"));
    }

        
        public int findHorseSpace(String name){
            for (int i=0; i<Barns.length; i++){
                if (Barns[i]!=null && Barns[i].equals(name)){
                    return i;
                }
            }
            return -1;
        }

        public void consolidate(){
            Horse[] newBarns = new Horse[Barns.length];
            int index = 0;
            for (int i=0; i<newBarns.length; i++){
                if (Barns[i]!=null){
                    newBarns[index] = Barns[i];
                }
                index++;
            }
            Barns = newBarns;
        }
    }

