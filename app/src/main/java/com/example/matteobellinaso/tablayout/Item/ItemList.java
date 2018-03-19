package com.example.matteobellinaso.tablayout.Item;

import android.content.Context;

import com.example.matteobellinaso.tablayout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matteobellinaso on 15/03/18.
 */

public class ItemList {

    private static List<Item> listItem = new ArrayList<Item>();


    public static void initData(Context context){

        Item vader = new Item("Darth Vader" , R.drawable.vader, "Anakin Skywalker, anche conosciuto col suo nome Sith Dart Fener o Lord Fener, Scoperto da piccolo su Tatooine da Qui-Gon Jinn che crede possa essere il \"Prescelto\", in seguito alla morte di questi diviene apprendista di Obi-Wan Kenobi.");
        Item maul = new Item("Darth Maul", R.drawable.maul, "Darth Maul o Lord Maul, noto anche solo come Maul,Di razza Zabrak del pianeta di Dathomir, da piccolo è stato preso in custodia da Darth Sidious, che lo ha indirizzato nelle vie del Lato Oscuro.");
        Item palpatine = new Item("Imperatore Palpatine", R.drawable.palpatine, "Sheev Palpatine, noto anche col suo nome Sith di Darth Sidious o Lord Sidious e dopo la proclamazione dell'Impero Galattico, come l'Imperatore, Inizialmente senatore carismatico di Naboo, in realtà Palpatine è Darth Sidious, il Signore Oscuro dei Sith, estinti secondo molti da anni." );
        Item kylo = new Item("Kylo Ren", R.drawable.kylo, "Kylo Ren, nome con cui è conosciuto Ben Solo,Volendo emulare le gesta di suo nonno Anakin Skywalker, alias Dart Fener, egli passa al Lato Oscuro della Forza, uccide tutti i Padawan suoi compagni eccetto che sei, i 7 si uniscono all'ordine dei Cavalieri di Ren per poi unirsi al unirsi al Primo Ordine.");
        Item boba = new Item("Boba Fett", R.drawable.boba_fett, "Egli indossa una corazza Mandaloriana modificata verde simile a quella del padre. La sua fortuna come cacciatore di taglie cresce a dismisura a partire dal 19 BBY, ovvero durante i fatti di La vendetta dei Sith, spesso alle dipendenze di Jabba the Hutt. ");
        Item guard = new Item("Royal Guard", R.drawable.royal, "La Guardia Reale dell'Imperatore, detta anche Guardia Reale Imperiale o Guardia Imperiale, era un ordine d'élite di protettori assegnati all'imperatore Sheev Palpatine dell'Impero Galattico. Armati di picche di forza e completamente rivestiti nei loro anonimi elmetti e vesti cremisi, le guardie reali erano una forza silenziosa, imponente e mortale al servizio dell'imperatore.");
        Item trooper = new Item("Strom Trooper", R.drawable.trooper, "Fedeli all'imperatore Palpatine, erano il nucleo primario dei Corpi d'assalto che operava in pratica sulla totalità dei pianeti sotto il controllo imperiale. Pur derivando dai Clone trooper della Repubblica, gli Stormtrooper erano reclute addestrate nelle varie Accademie sparse per l'Impero.");

        listItem.add(vader);
        listItem.add(maul);
        listItem.add(palpatine);
        listItem.add(kylo);
        listItem.add(boba);
        listItem.add(guard);
        listItem.add(trooper);

    }

    public static List<Item> getListItem(){
        return listItem;
    }


}
