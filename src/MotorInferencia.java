import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.google.gson.Gson;

public class MotorInferencia {
    private List<Regla> reglas;

    public MotorInferencia(String rutaJson) throws IOException {
        reglas = cargarReglas(rutaJson);
    }

    private List<Regla> cargarReglas(String ruta) throws IOException {
        Gson gson = new Gson();
        Regla[] array = gson.fromJson(new FileReader(ruta), Regla[].class);
        return Arrays.asList(array);
    }

    public List<Diagnostico> evaluar(Sintoma s) {
        List<Diagnostico> resultados = new ArrayList<>();
        for (Regla r : reglas) {
            if (r.coincide(s)) resultados.add(r.generarDiagnostico());
        }
        resultados.sort((a, b) -> Integer.compare(b.getPeso(), a.getPeso()));
        return resultados;
    }
}
