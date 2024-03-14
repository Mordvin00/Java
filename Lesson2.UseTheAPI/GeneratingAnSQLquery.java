/*
Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer.

Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами

Пример:
Строка sql-запроса:
select * from students where

Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Результат:
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
*/


// Моё решение:
// import java.util.HashMap;
// import java.util.Map;


public class GeneratingAnSQLquery {
    public static void main(String[] args) {
        // Map<String, String> params1 = new HashMap<String,String>();
        // params1.put("name","Ivanov");
        // params1.put("country","Russia");
        // params1.put("city","Moscow");
        // params1.put("age",null);
       
        String QUERY = "select * from students where ";
	    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
    }
    public static StringBuilder answer(String QUERY, String PARAMS)
    {
        StringBuilder s = new StringBuilder();
        for (String string : PARAMS)
        {
            if (string.getValue() != null)
            {
                s.append(string.getKey() +"= '" + string.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
}
/*
Вторая задача: import java.util.Map;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder result = new StringBuilder(QUERY);

        // Убираем лишние пробелы и символы
        PARAMS = PARAMS.replaceAll("\\s", "");
        PARAMS = PARAMS.replaceAll("\"", "");
        PARAMS = PARAMS.substring(1, PARAMS.length() - 1);

        String[] keyValuePairs = PARAMS.split(",");
        if (keyValuePairs.length > 0) {
            result.append("");
        }

        for (String pair : keyValuePairs) {
            String[] entry = pair.split(":");
            String key = entry[0];
            String value = entry[1];

            if (!value.equals("null")) {
                result.append(key).append("='").append(value).append("' and ");
            }
        }

        // Убираем последний "and"
        if (result.length() > QUERY.length()) {
            result.setLength(result.length() - 5); // Убираем " and "
        }

        return result;
    }
}

Идеальное решение:

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        for (int i = 0; i < params.length; i++){
            String[] elements = params[i].replace('"', ' ').split(":");
            if(!"null".equals(elements[1].trim())){       
              stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2) stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
    }
}


public class Printer{ 
    public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";

      if (args.length == 0) {
        QUERY = "select * from students where ";
        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     

      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
    }
}

*/