import java.io.*;
class room{
        int length,width;
        room(int x,int y){
            length=x;
            width=y;
        }
    }
        public void area(){
            area=length*width;
            return area;
        }
          class hall extend room{
            int height;
            hall(int x,int y,int z){
                super(x,y);
                height=z;
            }
        }
            public void  volume(){
                volume = length*width*height;
                 return volume;
            }
            class singleinheritance{
                public static void main(String[] args){
                    hall h1=new  hall(10,10,10);
                    int a1=h1.area();
                    int v1=h1.volume();
                  System.out.println("area of room="+a1);
                }
                System.out.println("volume of room= "+v1)
                }
            }
            
