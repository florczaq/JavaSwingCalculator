import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;

public class Calculations {
    public String calculate(String result) throws ScriptException {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            return engine.eval(result).toString();
        } catch (Exception e) {
            return " ";
        }
    }
}