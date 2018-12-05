/**
 * 
 */
package com.lnt.java_basic08.string_demo;

/**
 * @author brije
 *
 */
public class StringSplitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "a/b/c/d";
		String[] a1 = s1.split("/");
		System.out.println("split string using only regex:");
		//enhanced for loop used for iteration (arrays/collection)
		for (String str : a1) {
			System.out.println(str);
		}
		String emails = "Aashish Mishra <Aashish.Mishra@lntinfotech.com>; AMOL AKOTKAR <Amol.Akotkar@lntinfotech.com>; Apoorva Barapatre <Apoorva.Barapatre@lntinfotech.com>; Ashwini Madage <Ashwini.Madage@lntinfotech.com>; Bhalchandra Kanitkar <Bhalchandra.Kanitkar@Lntinfotech.com>; DHEERENDRA KACHHWAHA <Dheerendra.Kachhwaha@lntinfotech.com>; Dipali Chaudhari <Dipali.Chaudhari@lntinfotech.com>; Garima Dhanetwal <Garima.Dhanetwal@lntinfotech.com>; Imran Naikwadi <Imran.Naikwadi@lntinfotech.com>; Janardhan M <Janardhan.M@lntinfotech.com>; Ketki Limaye <Ketki.Limaye@lntinfotech.com>; Monika Dubey <Monika.Dubey@lntinfotech.com>; Monishadevi Govindarasu <Monishadevi.Govindarasu@lntinfotech.com>; Nikhil Dharane <Nikhil.Dharane@lntinfotech.com>; Ninad Kulkarni <Ninad.Kulkarni@lntinfotech.com>; Nupur Chakraborty <Nupur.Chakraborty@lntinfotech.com>; Prachi Zadge <Prachi.Zadge@lntinfotech.com>; Pravesh Gupta <Pravesh.Gupta@lntinfotech.com>; Priya Vaidya <Priya.Vaidya@lntinfotech.com>; PRIYANKA SHARMA <Priyanka.Sharma@lntinfotech.com>; Raj Thakur <Raj.Thakur@lntinfotech.com>; Sandesh Omar <Sandesh.Omar@lntinfotech.com>; Saraswati Tudu <Saraswati.Tudu@lntinfotech.com>; Shafali Kashyap <Shafali.Kashyap@lntinfotech.com>; Shobha Devadiga <Shobha.Devadiga@lntinfotech.com>; Sudipta Dutta <Sudipta.Dutta@lntinfotech.com>; Wasiyasarvar Shafi <Wasiyasarvar.Shafi@lntinfotech.com>; Swati Rathore <Swati.Rathore@lntinfotech.com>; SHREEYASH NICHKAWADE <SHREEYASH.NICHKAWADE@lntinfotech.com>; Dipali Deshmukh <Dipali.Deshmukh@lntinfotech.com>; A Reddy <A.Reddy@lntinfotech.com>; Aditya Samudra <Aditya.Samudra@lntinfotech.com>; Amitv Kumar <AmitV.Kumar@lntinfotech.com>; Amita Chaudhary <Amita.Chaudhary@lntinfotech.com>; Anusha Appallagari <Anusha.Appallagari@lntinfotech.com>; Atul Bhalerao <Atul.Bhalerao@lntinfotech.com>; Debi Prasad Das <DebiPrasad.Das@lntinfotech.com>; Dhivya pichandi <Dhivya.Pichandi@lntinfotech.com>; Divakara SC <Divakara.SC@lntinfotech.com>; Ganesh Baskar <Ganesh.Baskar@lntinfotech.com>; Hrusikesh Das <Hrusikesh.Das@lntinfotech.com>; Jitendra Choudhary <Jitendra.Choudhary@lntinfotech.com>; Kavya S <Kavya.S@lntinfotech.com>; ManojKumar Gupta <ManojKumar.Gupta@lntinfotech.com>; Mayuri Deshpande <Mayuri.Deshpande@lntinfotech.com>; Merlin Jeyarani <Merlin.Jeyarani@lntinfotech.com>; Mohita Rajput <Mohita.Rajput@lntinfotech.com>; Neha Kolhe <Neha.Kolhe@lntinfotech.com>; Prerana Patil <Prerana.Patil@lntinfotech.com>; Priyanka Martha <Priyanka.Martha@lntinfotech.com>; Rajkumar Senapati <Rajkumar.Senapati@lntinfotech.com>; Ranjan Samal <Ranjan.Samal@lntinfotech.com>; Riteshr Gupta <RiteshR.Gupta@lntinfotech.com>; Senthil Devadhas <Senthil.Devadhas@lntinfotech.com>; Shriram Saraf <Shriram.Saraf@lntinfotech.com>; Shruthi V <Shruthi.V@lntinfotech.com>; Shubhada Latake <Shubhada.Latake@lntinfotech.com>; Sreena Pillai <Sreena.Pillai@lntinfotech.com>; Stephen Raj B <Stephen.RajB@lntinfotech.com>; Sujitkumar Mulik <Sujitkumar.Mulik@lntinfotech.com>; Suriya Muthusamy <Suriya.Muthusamy@lntinfotech.com>; Tanushree G <Tanushree.G@lntinfotech.com>; Walnes Dsouza <Walnes.Dsouza@lntinfotech.com>; Yogesh Kumar Bathri <YogeshKumar.Bathri@lntinfotech.com>";
		String[] emailArr = emails.split(";");
		System.out.println("\nspliting list of email using ;\n");
		//enhanced for loop used for iteration (arrays/collection)
		int i=1;
		for (String str : emailArr) {
			System.out.println(""+i+++"> "+str);
		}
	}

}
