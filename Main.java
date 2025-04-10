public class NotSoGoodSortz {
public static void main(String[] args){
int[] oOoOo = {5,2,9,1,5,6};
sortDem(oOoOo);
for(int x=0; x<oOoOo.length; x++)
System.out.print(oOoOo[x]+" ");
}

public static void sortDem(int[] blip){
for(int i=0; i<blip.length - 1; i++){
for(int j=0; j<blip.length - 1; j++){
if(blip[j] > blip[j+1]){
int tempz = blip[j];
blip[j] = blip[j+1];
blip[j+1] = tempz;
}}}
}
