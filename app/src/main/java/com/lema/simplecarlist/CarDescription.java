package com.lema.simplecarlist;

/**
 * Created by Krzysiek on 01.02.2018.
 */

public class CarDescription {
    private String name;
    private String description;


    public CarDescription(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final CarDescription[]CAR_DESCRIPTIONS = {
            new CarDescription("Mercedes","niemiecka marka samochodów produkowanych przez koncern Daimler AG (uprzednio DaimlerChrysler AG), zaś wcześniej przez koncern Daimler-Benz, popularnie nazywana mercedes. Pod marką tą produkowane są samochody osobowe, dostawcze, ciężarowe i autobusy. W kategorii samochodów osobowych, mercedes-Benz uważany jest za jedną z najbardziej prestiżowych marek na świecie, zarazem jedną z najstarszych."),
            new CarDescription("Audi", " niemiecki producent samochodów osobowych z siedzibą w Ingolstadt w Bawarii, należący do koncernu Volkswagen AG. Założony w 1909 roku przez Augusta Horcha. Nazwa przedsiębiorstwa wywodzi się z gry słów: Audi to łacińska transkrypcja nazwiska Horch (oznacza „słuchaj!”)."),
            new CarDescription("BMW","niemiecki koncern motoryzacyjny produkujący od 1916 roku samochody osobowe, motocykle, skutery oraz silniki"),
            new CarDescription("Chevrolet","amerykańska marka motoryzacyjna należąca do koncernu General Motors, której samochody dostępne są w ponad 140 krajach na całym świecie. Jest czwartą najczęściej kupowaną marką samochodów na świecie."),
            new CarDescription("Fiat","włoski koncern motoryzacyjny z siedzibą w Turynie założony 11 lipca 1899 roku przez Giovanniego Agnellego[1]. W 2014 roku w wyniku połączenia z amerykańskim koncernem Chrysler przekształcony w koncern Fiat Chrysler Automobiles "),
            new CarDescription("Ford","amerykański koncern motoryzacyjny założony 16 czerwca 1903 roku przez Henry'ego Forda w Detroit"),
            new CarDescription("Suzuki","japońskie przedsiębiorstwo produkujące wiele modeli samochodów, motocykli, silników do motorówek i wiele innych silników spalinowych różnego zastosowania. Należy do wielkiej czwórki (Suzuki, Yamaha, Honda oraz Kawasaki) największych dystrybutorów motocykli na świecie. Suzuki posiada 15 fabryk w 14 krajach i 133 dystrybutorów w 119 krajach."),
            new CarDescription("Honda"," japońskie przedsiębiorstwo produkujące samochody, motocykle, skutery, samoloty, silniki oraz różnego rodzaju maszyny do celów budowlanych, rolniczych i innych. Obecnie jest największym producentem silników na świecie. Produkuje ich ponad 25 milionów rocznie. Zakłady produkcyjne umieszczono w ponad 30 różnych krajach. Główna siedziba znajduje się w Tokio. Natomiast siedziba Honda Motor Europe Limited znajduje się w Slough (Wielka Brytania). Montesa Honda to jednostka zależna Hondy, znajdująca się Prowincji Barcelony w Hiszpanii."),
            new CarDescription("Volkswagen","marka samochodów produkowanych od 1937 roku przez niemiecki koncern Volkswagen AG. W dosłownym tłumaczeniu znaczy samochód ludu"),
            new CarDescription("Toyota","Historia firmy Toyota sięga 1918 roku, kiedy to Sakichi Toyoda założył firmę Toyoda Spinning and Weaving Co. Ltd.. Przy pomocy swojego syna - Kiichirō Toyody zbudował w 1924 roku automatyczny warsztat tkacki. W 1926 roku Toyoda założył zakład Toyoda Automatic Loom Works. Pod koniec lat 20. XX wieku Kiichirō Toyoda przebywał w Europie i Stanach Zjednoczonych, gdzie zainteresował się branżą motoryzacyjną. W 1933 roku we warsztatach tkackich utworzony został dział samochodów[3]. Początkowo zbudowany został sześciocylindrowy silnik o pojemności 3.4l")
            };
    public static final int carImages[] ={R.drawable.mercedes,R.drawable.audi,R.drawable.bmw,R.drawable.chevrolet,R.drawable.fiat,R.drawable.ford,R.drawable.suzuki,R.drawable.honda,R.drawable.volkswagen,R.drawable.toyota};
}
