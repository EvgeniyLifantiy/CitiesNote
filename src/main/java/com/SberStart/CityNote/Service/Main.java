package com.SberStart.CityNote;


@Service
public class Main {

    private List<City> CitiesNoteBook=new ArrayList<>();

    private Scanner scanner;

    public String main(String fileName)  {
        connect(fileName);
        return readCities().toString();
    }

    public String sortCitiesByName(){

        return CitiesNoteBook.stream()
                .sorted(Comparator.comparing(City::getName))
                .collect(Collectors.toList())
                .toString();
    }


    public String sortCitiesByDistrict(){


        return CitiesNoteBook.stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName))
                .collect(Collectors.toList())
                .toString();
    }

    void connect(String fileName){
        try {
            scanner = new Scanner(Paths.get("src/main/resources/" + fileName+".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List readCities(){
        while(scanner.hasNext()){

            scanner.useDelimiter("\\s*;\\s*");

            CitiesNoteBook.add(new City(scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(),scanner.nextInt(),scanner.next()));
        }




        scanner.close();
        return CitiesNoteBook;
    }


}
