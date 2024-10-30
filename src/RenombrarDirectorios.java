 import java.io.File;
 
 public class RenombrarDirectorios {
    public void renombrarDirectorios(String path){
        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.err.println("La ruta path no es un directorio valido");
            return;
        }
        renombrarDirectoriosInternos(directorio);
    }
    public void renombrarDirectoriosInternos(File directorio){

        File[] directoriosArchivosInternos = directorio.listFiles();
        if (directoriosArchivosInternos == null) {
            return;
            
        }
        for (File directorioArchivo : directoriosArchivosInternos) {
            if (directorioArchivo.isDirectory()) {
                String nonbreOriginal = directorioArchivo.getName();
                String nuevoNombre = "nuevo-" + nonbreOriginal;
                File nuevoDirectorio = new File(directorioArchivo.getParent(), nuevoNombre);
            if(directorioArchivo.renameTo(nuevoDirectorio)){
                renombrarDirectoriosInternos(nuevoDirectorio);

            }   
                
            }
            
        }
    }
    
}
