package IHM.FFC;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Profile extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button cancel;
    private Button Heart,Suivi,Alim,Act_phy,Tabac,Stress,Hygiéne_Vie;
    private CardView card1 , card2 , card3 , card4 , card5 , card6;
    private TextView qst1 , qst2 , qst3 , qst4 , qst5 , qst6;
    private TextView answr1 , answr2 , answr3 , answr4 , answr5 , answr6;
    private TextView cnsl1 , cnsl2 , cnsl3 , cnsl4 , cnsl5 , cnsl6;
    private Person p ;
    private List<String> data = new ArrayList<>();
    private static final String TAG = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        p = getIntent().getExtras().getParcelable("Personne");
        data.add(p.getNom()); //0
        data.add(p.getSexe());
        data.add(p.getAge());

        data.add(p.getProb_cardiaqua()); //3
        data.add(p.getProb_colesterol());
        data.add(p.getDiabet());
        data.add(p.getHyperT());
        data.add(p.getParent_prob());
        data.add(p.getIMC());//8


        data.add(p.getCardiovasculaire());
        data.add(p.getBilan_car());
        data.add(p.getCardiologue());
        data.add(p.getPetit_dej());
        data.add(p.getFruits_legume());
        data.add(p.getBouffe_domicile());
        data.add(p.getSel());
        data.add(p.getCharcuterie());
        data.add(p.getNutri_score());
        data.add(p.getPas_quotidient());
        data.add(p.getSport_hebdo());
        data.add(p.getFréquence_cardiaque());
        data.add(p.getProfile_sportif());
        data.add(p.getActivité_weekend());
        data.add(p.getFumez_par_jour());
        data.add(p.getAncien_fumeur());
        data.add(p.getAutre_fumeur());
        data.add(p.getAntidépresseur());
        data.add(p.getGestion_famille());
        data.add(p.getStr_anx());
        data.add(p.getColére());
        data.add(p.getVerre_alco());
        data.add(p.getBoisson_energ());
        data.add(p.getDormir_7h());
        data.add(p.getTrouble_somm());


        Log.e("name from list" , data.get(0));



        Heart = (Button) findViewById(R.id.button18);
        Suivi = (Button) findViewById(R.id.button25);
        Alim = (Button) findViewById(R.id.alim);
        Act_phy = (Button) findViewById(R.id.act_phy);
        Tabac  = (Button) findViewById(R.id.conso_tabac);
        Stress = (Button) findViewById(R.id.gst_str);
        Hygiéne_Vie = (Button) findViewById(R.id.Hyg_vie);

        Heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(1);
            }
        });

        Suivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(2);
            }
        });

        Alim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(3);
            }
        });

        Act_phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(4);
            }
        });

        Tabac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(5);
            }
        });

        Stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(6);
            }
        });

        Hygiéne_Vie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupdialog(7);
            }
        });






    }


    public void popupdialog(int choix)
    {
        dialogBuilder = new AlertDialog.Builder(this);
        final View popupview = getLayoutInflater().inflate(R.layout.popup,null);

        cancel = (Button) popupview.findViewById(R.id.cancel);
        card1 = (CardView) popupview.findViewById(R.id.card1);
        card2 = (CardView) popupview.findViewById(R.id.card2);
        card3 = (CardView) popupview.findViewById(R.id.card3);
        card4 = (CardView) popupview.findViewById(R.id.card4);
        card5 = (CardView) popupview.findViewById(R.id.card5);
        card6 = (CardView) popupview.findViewById(R.id.card6);
        qst1 = (TextView) popupview.findViewById(R.id.qst1);
        qst2 = (TextView) popupview.findViewById(R.id.qst2);
        qst3 = (TextView) popupview.findViewById(R.id.qst3);
        qst4 = (TextView) popupview.findViewById(R.id.qst4);
        qst5 = (TextView) popupview.findViewById(R.id.qst5);
        qst6 = (TextView) popupview.findViewById(R.id.qst6);
        answr1 = (TextView) popupview.findViewById(R.id.ansr1);
        answr2 = (TextView) popupview.findViewById(R.id.ansr2);
        answr3 = (TextView) popupview.findViewById(R.id.ansr3);
        answr4 = (TextView) popupview.findViewById(R.id.ansr4);
        answr5 = (TextView) popupview.findViewById(R.id.ansr5);
        answr6 = (TextView) popupview.findViewById(R.id.ansr6);
        cnsl1 = (TextView) popupview.findViewById(R.id.cnsl1);
        cnsl2 = (TextView) popupview.findViewById(R.id.cnsl2);
        cnsl3 = (TextView) popupview.findViewById(R.id.cnsl3);
        cnsl4 = (TextView) popupview.findViewById(R.id.cnsl4);
        cnsl5 = (TextView) popupview.findViewById(R.id.cnsl5);
        cnsl6 = (TextView) popupview.findViewById(R.id.cnsl6);
        dialogBuilder.setView(popupview);
        dialog = dialogBuilder.create();
        dialog.show();


        switch(choix)
        {
            case 1:
                card6.setVisibility(View.GONE);
                qst1.setText("1. Avez-vous un problème cardiaque ?");
                answr1.setText(p.getProb_cardiaqua());
                cnsl1.setText("Le conseil de notre cardiologue : Etes-vous suivi régulièrement par votre médecin traitant et votre cardiologue ? Dans tous les cas, ne prenez-pas de médicaments sans en parler à votre proscrire l’automédication Et apprenez à connaître les signes d’alerte en cas d’infarctus ou d’AVC et les premiers symptômes d’insuffisance cardiaque. Par ailleurs, connaissez-vous les Clubs Cœur et Santé ?\n");
                qst2.setText("2. Avez-vous un problème de cholestérol ?");
                answr2.setText(p.getProb_colesterol());
                cnsl2.setText("Le conseil de notre cardiologue : Le taux de mauvais cholestérol (LDL-cholestérol) dans le sang à ne pas dépasser dépend de votre risque cardiovasculaire et de vos antécédents de maladies cardiovasculaires. Consultez notre brochure sur le sujet\n");
                qst3.setText("3. Êtes-vous diabétique ?");
                answr3.setText(p.getDiabet());
                cnsl3.setText("Le conseil de notre cardiologue : En 2019, en France plus de 4,5 millions de personnes sont diabétiques mais 1 million d’entre elles l’ignorent. Le diabète de type 2 est le plus fréquent et il est traité par des médicaments. Consultez nos 3 articles sur le sujet : le diabète, contrôler le diabète par la nutrition, contrôler le diabète par l’activité physique\n");
                qst4.setText("4. Avez-vous de l'hypertension ?");
                answr4.setText(p.getHyperT());
                cnsl4.setText("Le conseil de notre cardiologue : En France, 15 millions de personnes sont hypertendues dont 50% de personnes de plus de 65 ans. Or un tiers l’ignore et seulement un tiers est bien traité. La définition de l’hypertension : une pression artérielle supérieur ou égale à 140 / 90 mm Hg en consultation ou une pression supérieure ou égale à 135 / 85 mm Hg en auto-mesure. Pour en savoir plus télécharger notre brochure sur l’hypertension, pour vous aider au quotidien, découvrez le carnet de suivi de l’hypertendu.\n");
                qst5.setText("5. Antécédents cardiovasculaires : Avez-vous un parent du premier degré (père, mère, frère ou sœur) qui a eu des problèmes cardiaques (infarctus, AVC, mort subite) avant 55 ans pour un homme ou avant 65 ans chez une femme ?\n");
                answr5.setText(p.getParent_prob());
                cnsl5.setText("Le conseil de notre cardiologue : Les maladies cardiovasculaires peuvent être héréditaires. Si vous avez, dans votre famille, des personnes qui en sont atteintes, parlez-en à votre médecin traitant.\n");
                break;
            case 2:
                card4.setVisibility(View.GONE);
                card5.setVisibility(View.GONE);
                card6.setVisibility(View.GONE);
                qst1.setText("1. Avez-vous déjà fait le point avec votre médecin traitant à propos de votre risque cardiovasculaire ?\n");
                answr1.setText(p.getCardiovasculaire());
                cnsl1.setText("Le conseil de notre cardiologue : Connaissez-vous les facteurs de risque cardiovasculaire ? Consultez notre chapitre sur le sujet\n");
                qst2.setText("2. Avez-vous déjà effectué un bilan cardiaque ?\n");
                answr2.setText(p.getBilan_car());
                cnsl2.setText("Le conseil de notre cardiologue : A partir de 45-50 chez l’homme et de 50-55 ans chez la femme ou plus tôt si vous avez des symptômes (douleur thoracique, essoufflement, palpitations, malaises et pertes de connaissance), n’hésitez pas à demander à votre médecin traitant s’il faut faire un bilan cardiaque. Le bilan initial (examen clinique et ECG) sera le plus souvent réalisé par votre médecin traitant. Il vous orientera si besoin vers un cardiologue pour réaliser un bilan cardiaque plus complet.\n");
                qst3.setText("3. Avez-vous déjà consulté un cardiologue ?\n");
                answr3.setText(p.getCardiologue());
                cnsl3.setText("Le conseil de notre cardiologue : Quels sont les principaux examens que votre cardiologue peut vous prescrire ? Découvrez notre brochure Les examens en cardiologie.\n");
                break;
            case 3:
                qst1.setText("Commencez-vous votre journeé par un petit-déjeuner ?\n");
                answr1.setText(p.getPetit_dej());
                cnsl1.setText("Le conseil de notre cardiologue : Vous ne savez pas comment équilibrer votre petit déjeuner ? Nos conseils ici : Qu’est ce qu’un petit déjeuner équilibré ?\n");
                qst2.setText("2. Mangez-vous des fruits et légumes tous les jours ?\n");
                answr2.setText(p.getFruits_legume());
                cnsl2.setText("Le conseil de notre cardiologue : Le taux de mauvais cholestérol (LDL-cholestérol) dans le sang à ne pas dépasser dépend de votre risque cardiovasculaire et de vos antécédents de maladies cardiovasculaires. Consultez notre brochure sur le sujet\n");
                qst3.setText("3. À votre domicile, vous mangez le plus souvent ?\n");
                answr3.setText(p.getBouffe_domicile());
                cnsl3.setText("Le conseil de notre cardiologue : Saviez-vous qu’il faut privilégier dans la mesure du possible des plats faits maison ? Pour vous donner des idées, retrouvez toutes nos recettes.\n");
                qst4.setText("4. Resalez-vous vos plats ?\n");
                answr4.setText(p.getSel());
                cnsl4.setText("Le conseil de notre cardiologue : De nombreuses astuces existent pour limiter sa consommation de sel (celle-ci est néfaste pour vos artères). Supprimer la salière de votre table et favoriser les épices. Découvrez nos conseils ici : Comment réduire sa consommation de sel ?.\n");
                qst5.setText("5. Mangez-vous au moins 4 fois par semaine de la charcuterie ?\n");
                answr5.setText(p.getCharcuterie());
                cnsl5.setText("Le conseil de notre cardiologue : La charcuterie et plus généralement les produits transformés ont des effets néfastes sur votre cœur et vos artères. Quelques astuces pour diversifier et varier votre alimentation.\n");
                qst6.setText("6. Connaissez-vous le Nutri-Score ?\n");
                answr6.setText(p.getNutri_score());
                cnsl6.setText("Le conseil de notre cardiologue : Découvrez le Nutri-Score dans notre brochure Alimentation. Il vous permettra de mieux choisir vos plats cuisinés et d’une manière générale tous vos aliments transformés. Consultez notre brochure Alimentation\n");
                break;
            case 4:
                card6.setVisibility(View.GONE);
                qst1.setText("Marchez-vous d'un bon pas tous les jours ?\n");
                answr1.setText(p.getPas_quotidient());
                cnsl1.setText("Le conseil de notre cardiologue : La marche est l’activité physique la plus simple à mettre en place dans votre routine quotidienne : descendre une station de bus ou de métro avant votre arrêt habituel, téléphoner debout ou réaliser les petits trajets quotidiens à pied ou à vélo. Pour en savoir plus, télécharger notre brochure sur l’activité physique.\n");
                qst2.setText(". Combien de fois par semaine pratiquez-vous des activités physiques pendant au moins 30 minutes ?\n");
                answr2.setText(p.getSport_hebdo());
                cnsl2.setText("Le conseil de notre cardiologue : Saviez-vous que 30 minutes d’activité physique par jour diminuent de 25 à 30 % le risque de mortalité cardiovasculaire ? 30 minutes d’activité physique par jour c’est essentiel. Il faut aussi pratiquer au moins 1 heure d’exercice physique par semaine et réduire le temps passé assis : (un sportif peut être sédentaire) !\n");
                qst3.setText("3. Êtes-vous diabétique ?");
                answr3.setText(p.getDiabet());
                cnsl3.setText("Le conseil de notre cardiologue : En 2019, en France plus de 4,5 millions de personnes sont diabétiques mais 1 million d’entre elles l’ignorent. Le diabète de type 2 est le plus fréquent et il est traité par des médicaments. Consultez nos 3 articles sur le sujet : le diabète, contrôler le diabète par la nutrition, contrôler le diabète par l’activité physique\n");
                qst4.setText("3. Connaissez-vous votre fréquence cardiaque à ne pas dépasser lors d’un effort ?\n");
                answr4.setText(p.getFréquence_cardiaque());
                cnsl4.setText("Le conseil de notre cardiologue : C’est la fréquence maximale théorique (FMC) = 220 - votre âge.4. Concernant votre profil sportif, diriez-vous que :\n" +
                        "Vous faites du sport régulièrement depuis plus de 10 ans (supprimer la mention Depuis plus de 10 ans)\n" +
                        "Le conseil de notre cardiologue : Comment se motiver à faire du sport ? Quelques pistes ici. Comment débuter ou reprendre une activité physique en toute sécurité ? Pour en savoir plus, découvrez notre brochure Activité physique.\n");
                qst5.setText("5. Parmi les activités suivantes, laquelle pratiqueriez-vous le plus facilement pendant vos weekends ?\n");
                answr5.setText(p.getActivité_weekend());
                cnsl5.setText("Le conseil de notre cardiologue : Si regarder la télévision ou jouer à des jeux vidéo peuvent faire partie de votre routine pour vous détendre sachez qu’il n’y a pas mieux que la marche ou le sport pour décharger toutes les tensions de la journée. Il s’agit d’un excellent anti-stress et il permet aussi d’abaisser votre pression artérielle.\n");
                break;
            case 5:
                card4.setVisibility(View.GONE);
                card5.setVisibility(View.GONE);
                card6.setVisibility(View.GONE);
                qst1.setText("1. Fumez-vous au moins une fois par jour ?\n");
                answr1.setText(p.getFumez_par_jour());
                cnsl1.setText("Le conseil de notre cardiologue : 80% des victimes d’infarctus âgées de moins de 45 ans sont des fumeurs. Et savez-vous qu’il n’y a pas de petit tabagisme sans risque ? Pour en savoir plus : retrouvez tous nos articles sur le tabac et ses risques .\n");
                qst2.setText("2. Êtes-vous un ancien fumeur (vous avez arrêté depuis moins de 5 ans) ?\n");
                answr2.setText(p.getAncien_fumeur());
                cnsl2.setText("Le conseil de notre cardiologue : Après 5 ans, le risque d’infarctus du myocarde serait équivalent à celui d’un non-fumeur. Tenez bon ! Pour plus d’infos retrouvez notre brochure sur le Tabac .\n");
                qst3.setText("3. Une ou d'autres personnes fument-elles à votre domicile ?\n");
                answr3.setText(p.getAutre_fumeur());
                cnsl3.setText("Le conseil de notre cardiologue : Le tabagisme passif est également nocif pour votre santé. Découvrez des conseils pour convaincre la/les personnes qui fume/nt à votre domicile d’arrêter : Les bénéfices immédiats de l’arrêt du tabac.\n");
                break;
            case 6 :
                card5.setVisibility(View.GONE);
                card6.setVisibility(View.GONE);
                qst1.setText("1.Vous sentez-vous stressé(e) ou anxieux(se) ?\n");
                answr1.setText(p.getStr_anx());
                cnsl1.setText("Le conseil de notre cardiologue : Le stress n’est pas une fatalité, découvrez les 10 règles d’or pour mieux le gérer (cf observatoire du stress – chapitre 3) Pour en savoir plus : retrouvez tous nos articles sur le stress.\n");
                qst2.setText("2. Êtes-vous sujet à des colères ?\n");
                answr2.setText(p.getColére());
                cnsl2.setText("Le conseil de notre cardiologue : Saviez vous que les colères sont le facteur déclenchant le plus nocif du stress aigu ? Découvrez quelles sont les conséquences du stress sur la santé.\n");
                qst3.setText("3. Prenez-vous des antidrépresseurs, anxiolotiques ou hypnotiques ?\n");
                answr3.setText(p.getAntidépresseur());
                cnsl3.setText("Le conseil de notre cardiologue : Connaissez-vous les limites entre l’angoisse et le stress ?.\n");
                qst4.setText("4. Gérez-vous seul votre environnement famillial ?\n");
                answr4.setText(p.getGestion_famille());
                cnsl4.setText("Le conseil de notre cardiologue : Les causes du stress sont multiples. Découvrez plus d’informations dans notre brochure Cœur et stress.\n");
                break;
            case 7 :
                card5.setVisibility(View.GONE);
                card6.setVisibility(View.GONE);
                qst1.setText("1.Vous arrive-t-il de boire plus de 3 verres d'alcool dans la journée 1 à 2 fois par semaine (vin et bière compris) ?\n");
                answr1.setText(p.getVerre_alco());
                cnsl1.setText("Le conseil de notre cardiologue : Saviez-vous que 80% des maladies cardiovasculaires sont évitables grâce à une bonne hygiène de vie. Bien que l’alcool ne soit pas contre-indiqué, une consommation modérée fait partie des recommandations essentielles, notamment en cas d’atteinte cardiaque : pas plus de deux verres par jour et pas plus de 5 jours par semaine.\n");
                qst2.setText("2. Vous arrive-t-il de boire des boissons énergisantes ?\n");
                answr2.setText(p.getBoisson_energ());
                cnsl2.setText("Le conseil de notre cardiologue : Attention à la consommation de boissons énergisantes dont les jeunes sont adeptes : consulter notre article sur le sujet. \n");
                qst3.setText("3. Dormez-vous plus de 7 heures par nuit ?\n");
                answr3.setText(p.getDormir_7h());
                cnsl3.setText("Le conseil de notre cardiologue : Une bonne qualité de sommeil et des horaires réguliers sont essentiels pour votre cœur et vos artères. Retrouvez ici nos conseils.\n");
                qst4.setText("4. Êtes-vous sujet à des troubles du sommeil ?\n");
                answr4.setText(p.getGestion_famille());
                cnsl4.setText("Le conseil de notre cardiologue : Si oui, parlez-en à votre médecin traitant. Il cherchera notamment des symptômes évoquant un syndrome d’apnée du sommeil.\n");
                break;
        }




        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }



}