package ipvc.estg.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import ipvc.estg.myapplication.databinding.ActivityMainBinding

class ReceitasPagina : AppCompatActivity() {

    private lateinit var receitasArrayList : ArrayList<Receita>
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.receitas_engordar)




        val imageId = intArrayOf(

            R.drawable.bc778d0c20c509a77c0c81c38c2abbe
        )

        val nomeReceitas = arrayOf(

        "Frango Panado sem Farinha",
        "Peixe Panado",
        "Carne Assada com Batata e Queijo",
        "Macarrão cremoso com legumes",
        "Macarrão com brócolos e bacon"

        )

        val ingredientes = arrayOf(

            arrayOf(
                "500 g de peito de frango",
                "Sal e pimenta-do-reino a gosto",
                "1 ovo",
                "60 g de queijo parmesão ralado",

                ),

            arrayOf(
                "4 filés de tilápia ou outro peixe de sua preferência",
                "3 dentes de alho amassados",
                "2 ramos de tomilhos",
                "2 colheres de sopa de azeite",
                "Farinha panko",
                "Sal e pimenta-do-reino a gosto",
                "Páprica a gosto",
                "3 colheres de suco de limão siciliano",
                "Raspas de limão",

                ),

            arrayOf(
                "4 batatas médias",
                "600 g de carne",
                "1 cebola picada",
                "1 colher de sopa de sal",
                "1 pitada de pimenta-do-reino",
                "1 colher de chá de páprica doce",
                "2 colheres de sopa de azeite",
                "200 g de mozzarela ralada",
                "Orégãos a gosto",

                ),

            arrayOf(
                "2 colheres de sopa de azeite",
                "1/2 cebola picada",
                "1/2 cenoura picada em cubinhos",
                "Sal e pimenta-do-reino a gosto",
                "4 dentes de alho picados",
                "1 xícara de chá de brócolis cozido",
                "1/2 xícara de chá de ervilhas",
                "2 colheres de chá de páprica doce defumada (ou páprica picante)",
                "1/2 xícara de chá de leite",
                "2 caixinhas de creme de leite",
                "1/2 pacote de macarrão já cozido (espaguete ou outro de sua preferência)",
                "Parmesão para servir e finalizar",

                ),

            arrayOf(
                "500 g de macarrão (tipo penne)",
                "2 colheres de café de sal",
                "1 fio de azeite",
                "300 g de bacon picado",
                "1 maço de brócolis picado",
                "50 ml de água",
                "1 pitada de pimenta",
                "1 colher de sopa de manteiga",

            )

        )

        val prep = arrayOf(

            "Corte o peito de frango em filés e tempere-os com sal e pimenta, coloque o ovo em um prato e bata-o levemente em outro, disponha o queijo ralado, passe os filés no ovo batido e depois no parmesão, asse-os em forno pré-aquecido a 200 °C por cerca de 30 minutos ou até dourar",
            "Em um recipiente plano, tempere os filés com alho, azeite, folhas de tomilho, páprica, sal, pimenta-do-reino, suco e raspas de limão, misture bem com a mão e vire o filé para pegar tempero dos dois lados, deixe descansar por uns 10 minutos, em uma vasilha, coloque a farinha para empanar, coloque os filés na farinha e empane bem dos dois lados, coloque o peixe na airfryer, de modo em que os filés não fiquem um sobre o outro, aumente a temperatura da frigideira para 200 °C por cerca de 20 minutos ou até que fique dourado, virando os filés na metade do tempo",
            "Corte as batatas e a carne em cubinhos, e coloque-as em um refratário Adicione também o sal, a pimenta, a páprica, a cebola, o azeite, e misture tudo, cubra o refratário com papel alumínio, e leve-o ao forno pré-aquecido a 200º graus por cerca de 40 a 50 minutos, retire o papel alumínio, acrescente o queijo ralado por cima da carne e das batatas, salpique orégano, e volte o refratário, para forno por mais 15 minutos;",
            "Em uma panela, adicione o azeite, a cebola, a cenoura e refogue até ficarem macios, tempere com sal e pimenta, acrescente o alho e refogue por mais 1 minuto, coloque os brócolos, as ervilhas, sal, pimenta, páprica e refogue por 1 minuto;, diminua o fogo, junte o leite, o creme de leite e misture bem, adicione o sal, a pimenta e misture, assim que levantar fervura, desligue o fogo, adicione o macarrão cozido e misture bem, salpique parmesão ralado por cima e sirva.",
            "Leve uma panela ao fogo médio, coloque o macarrão, a água e o sal, e deixe cozinhar até ele ficar al dente, depois, escorra a água, e reserve, leve outra panela ao fogo, adicione o azeite, e frite o bacon, acrescente os brócolos, o sal, a pimenta, coloque água, tampe a panela, e deixe-o cozinhar (ponto al dente) até a água secar, coloque a manteiga, misture, e desligue fogo, transfira o macarrão para um refratário, junte o brócolis e o bacon e sirva!"
        )

        receitasArrayList = ArrayList()

        for( i in 0..nomeReceitas.size){

            val receita = Receita(nomeReceitas[i], ingredientes[i], prep[i], imageId[0])

            receitasArrayList.add(receita)

        }

        val listview = findViewById<ListView>(R.id.listview)
        listview.isClickable = true
        listview.adapter = Adapter(this,receitasArrayList)
        listview.setOnItemClickListener{ parent, view, position, id  ->

           val nome = nomeReceitas[position]
           val ingredientes = ingredientes[position]
           val preparacao = prep[position]

           val i = Intent(this,receitas_engordar::class.java)



        }



    }


}