package graphics;
public class Renderer {
    public static int width = Main.WIDTH, height = Main.HEIGHT;
    public static int[] pixels = new int[width * height];
    
    public static void renderBackground(){
        for(int y = 0; y < width; y++){
            for(int x = 0; x<width; x++){
                pixels[x +y *width] = 0xfff4f4f4;
                
                if(x % 100 < 3 || x % 100 >97 || y % 100 <3 || y% 100 > 97){
                    pixels[x +y*width] = 0xffcccccc;
                }
            }
        }
    }
}
