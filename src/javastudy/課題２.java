package javastudy;

import java.util.Random;
import java.util.Scanner;

public class 課題２ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			Random r = new Random();
	
	
			int day=30;
			String[]statas= {"HP","OFF","DEF","LUCK","ゴールド","経験値","労働","信頼"};
			int gold=0;
			int sumgold=0;
			int exp=0;
			int sumexp=0;
			int labor=0;
			int trust=0;
			int hp=20;
			int off=20;
			int def=20;
			int luck=r.nextInt(10)+1;
			int fight=0;
			int level=1;
			int command;
			int command1;
			int days=30;
			int up=r.nextInt(10)+10;
			int hpup=r.nextInt(10)+60;
			int laborgold=r.nextInt(10)+150;
			int talk1=0;
			int talk2=0;
			int talk3=0;
			
			
			int bosshp=1000*level;
			int bossoff=100*level;
			int bossdef=100*level;
			int bossluck=r.nextInt(10)+50;
			int die=0;
			System.out.println("あなたはこれからの災厄に備えて30日間いきてもらいます");
			System.out.println("自由に行動をしてください　数字を入力してください");
			System.out.println();
			while(days!=0&&bosshp>=0&&die==0&&labor<=100) {
				int cpuhp=r.nextInt(20)+10*level;
				int cpuoff=r.nextInt(20)+5*level;
				int cpudef=r.nextInt(20)+5*level;
				int cpuluck=r.nextInt(10)+3*level;
				int cpudamage=off+luck;
				int damage=cpuoff+cpuluck;
				shop=0;
				fight=0;
				System.out.println("残り"+days+"日");
				System.out.println("行動　狩りに出る　１");
				System.out.println("行動　買い物に出る　２");
				System.out.println("行動　宿に泊まる　３");
				System.out.println("行動　仕事をする　４");
				System.out.println("行動　街の人々と話をする　５");
				System.out.println("行動　ステータスを確認する　６");
				System.out.println("行動　災厄に挑む　９");
				command1=s.nextInt();
				if(sumexp>=100) {
					hp+=up*level;
					off+=up*level;
					def+=up*level;
					luck=r.nextInt(10)+1+up;
					System.out.println(statas[0]+"が"+up*level+"上がった");
					System.out.println(statas[1]+"が"+up*level+"上がった");
					System.out.println(statas[2]+"が"+up*level+"上がった");
					System.out.println(statas[3]+"が"+up*level+"上がった");
					sumexp=0;
				}
				if(command1==1) {
					System.out.println("狩りに出た");
					System.out.println("戦闘が開始した");
					System.out.println("敵とじゃんけんをします0(グー)1(パー)2(チョキ)");
					while(fight<1&&hp>=0&&die==0) {
						int porson=s.nextInt();
						String[]janken={"グー","パー","チョキ"};
						int cpu=r.nextInt(3);
						if(porson>=3){
							System.out.println("エラーが起こりました");
							System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
						}
						else if((cpu-porson==-1)||cpu-porson==2) {
							if(cpudamage>cpudef) {
								System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
								System.out.println("敵に　"+(cpudamage-cpudef)+"のダメージを与えた");
								cpuhp=cpuhp-((off+luck)-cpudef);
							}
							else if(cpudamage<cpudef){
								System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
								System.out.println("敵に　"+1+"のダメージを与えた");
								cpuhp=cpuhp-1;
							}
						}
						else if(cpu==porson) {
							System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
							System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
						}
						else {
							if(damage>def) {
								System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
								System.out.println("あなたは　"+(damage-def)+"のダメージを受けた");
								hp=hp-(damage-def);
							}
							else if(damage<def) {
								System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
								System.out.println("あなたは　"+1+"のダメージを受けた");
								hp=hp-1;
							}
							}	
						if(cpuhp<=0) {
							System.out.println("あなたは戦闘に勝利した");
							gold=r.nextInt(50)+10;
							exp=r.nextInt(20)+10;
							System.out.println(exp+"経験値を手に入れ "+gold+"ゴールドを手に入れた");
							System.out.println();
							sumgold+=gold;
							sumexp+=exp;
							fight++;
							labor+=up;
							days--;
						}
						
						else if(hp<=0) {
							System.out.println("戦闘に負けた");
							System.out.println();
							die++;
						}
						}
							
					}
				if(command1==2) {
					while(shop<1) {
						System.out.println("お店にきました。何を買いますか");
						System.out.println("所持金 "+sumgold+" Gold");
						System.out.println("モンスターエナジー　１ 50Gold");
						System.out.println("レッドブル　２ 100Gold");
						System.out.println("オロナミンC　３ 100Gold");
						System.out.println("デカビタ　４ 1000Gold");
						System.out.println("店を出る　９");
						command=s.nextInt();
							if(command==1) {
								System.out.println("ほんとにモンスターエナジーを買いますか　はい１　いいえ2");
								command=s.nextInt();
									if(command==1&&sumgold>=50) {
										System.out.println("モンスターエナジーを買った");
										System.out.println(statas[0]+"が"+up+"上がった");
										hp+=up;
										sumgold-=50;
										System.out.println();
									}
									else {
										System.out.println("どうした、、お金がないのか？他にもあるからみてくれ");
										System.out.println();
									}
							}
							else if(command==2) {
								System.out.println("ほんとにレッドブルを買いますか　はい１　いいえ2");
								command=s.nextInt();
									if(command==1&&sumgold>=100) {
										System.out.println("レッドブルを買った");
										System.out.println(statas[1]+"が"+up+"上がった");
										off+=up;
										sumgold-=100;
										System.out.println();
									}
									else {
										System.out.println("どうした、、お金がないのか？他にもあるからみてくれ");
										System.out.println();
									}
							}
							else if(command==3) {
								System.out.println("ほんとにオロナミンCを買いますか　はい１　いいえ2");
								command=s.nextInt();
									if(command==1&&sumgold>=100) {
										System.out.println("オロナミンCを買った");
										System.out.println(statas[2]+"が"+up+"上がった");
										def+=up;
										sumgold-=100;
										System.out.println();
									}
									else {
										System.out.println("どうした、、お金がないのか？他にもあるからみてくれ");
										System.out.println();
									}
							}
							else if(command==4) {
								System.out.println("ほんとにデカビタを買いますか　はい１　いいえ2");
								command=s.nextInt();
									if(command==1&&sumgold>=1000) {
										System.out.println("デカビタを買った");
										System.out.println(statas[3]+"が"+up+"上がった");
										luck+=up;
										sumgold-=1000;
										System.out.println();
									}
									else {
										System.out.println("どうした、、お金がないのか？他にもあるからみてくれ");
										System.out.println();
									}
							}
							else if(command==9) {
								System.out.println("店を出ました");
//								shop++;
								days--;
								System.out.println();
								break;
							}
					}
				}
				if(command1==3) {
					while(true) {
						System.out.println("宿に泊まるか？　泊まる１　泊まらない２");
						System.out.println("無料だぞ");
						command=s.nextInt();
						if(command==1) {
							System.out.println("宿に泊まった "+statas[0]+"が"+hpup+"上がった");
							System.out.println();
							hp+=hpup;
							shop++;
							days--;
							labor-=up;
							}
						else {
							System.out.println("泊まらないのか、、また今度きてくれ");
							System.out.println();
							break;
							}
						}
					}
				if(command1==4) {
					while(shop<1) {
						System.out.println("仕事をするのか　はい１　いいえ２");
						command=s.nextInt();
						if(command==1) {
							sumgold+=laborgold;
							System.out.println("働いてきた"+laborgold+"Goldもらった");
							System.out.println();
							labor+=up;
							shop++;
							days--;
						}
						else {
							System.out.println("そうか、、また働きたくなったらきてくれ");
							System.out.println();
							shop++;
						}
					}
				}
				if(command1==5) {
					while(true) {	
						System.out.println("町に出かけた　誰に話しかけますか");
						System.out.println("神父　1");
						System.out.println("町長　２");
						System.out.println("コック　３");
						System.out.println();
						command=s.nextInt();
					if(command==1&&talk1==0) {
						System.out.println("やぁこんにちは、私は神父だ");
						System.out.println("なんだか近々災厄が来るらしいじゃないか");
						System.out.println("逃げる準備をしないとな");
						System.out.println();
						talk1++;
						days--;
					}
					else if(command==1&&talk1==1) {
						System.out.println("なんだ、また話を聞きにきたのか");
						System.out.println("そうだな。運ってやつは結構大切だぞ。何かと助かる");
						System.out.println("まぁ役に立つ情報かわからないけどな");
						System.out.println();
						talk1++;
						shop++;
						days--;
					}
					else if(command==1&&talk1==2) {
						System.out.println("最近よく話すな。俺のことが気にいってんのか");
						System.out.println("そうだな、、もしお前がいいっていうなら");
						System.out.println("災厄と戦う時にでも呼んでくれ　連絡は４１８だからよ");
						System.out.println();
						talk1++;
						shop++;
						days--;
					}
					else if(command==2&&talk2==0) {
						System.out.println("君がここ最近町にきたものだな。");
						System.out.println("私はこの町の町長だ。いつでも頼ってくれ");
						System.out.println();
						talk2++;
						shop++;
						days--;
					}
					else if(command==2&&talk2==1) {
						System.out.println("お、早速か。そうだなとりあえずこれでもあげるよ");
						System.out.println("きっと役に立つとおもう");
						System.out.println("町長のお手製弁当をもらった");
						System.out.println(statas[0]+"が"+hpup+"上がった");
						System.out.println();
						talk2++;
						shop++;
						days--;
						hp+=hpup;
					}
					else if(command==2&&talk2==2) {
						System.out.println("また、きたのか。ここ最近頑張っているらしいじゃないか");
						System.out.println("災厄を倒す為にも町の人々に話をしたんだ");
						System.out.println("そしたら、みんな協力的なんだよ");
						System.out.println("いつでも呼んでいいとのことだった。７０９だ。覚えたか？");
						System.out.println();
						talk2++;
						shop++;
						days--;
					}
					else if(command==3&&talk3==0) {
						System.out.println("やあ、こんにちは、私はこの町のシェフだ");
						System.out.println("意外と評判でね。災厄が終わったら食べにきてくれよ");
						System.out.println("そしたら、たくさん御馳走するからさ");
						System.out.println();
						talk3++;
						shop++;
						days--;
					}
					else if(command==3&&talk3==1) {
						System.out.println("私の料理を食べにきたのかね。今は仕込み中なんだすまないよ");
						System.out.println("この作業がなかなか時間がかかるものでね大変なのさ");
						System.out.println("また、今度でいいからさ、顔出しにきてくれよ");
						System.out.println();
						talk3++;
						shop++;
						days--;
					}
					else if(command==3&&talk3==1) {
						System.out.println("お、君かぁ、、また仕込み中にきたんだね");
						System.out.println("いつも御馳走できないですまないよ");
						System.out.println("あ、そうそう、耳寄りの情報なんだけど");
						System.out.println("災厄は納豆が好きらしい。本当かどうかわからないけどもこれをあげるよ");
						System.out.println("納豆をもらった");
						System.out.println();
						talk3++;
						shop++;
						days--;
					}
					else {
						System.out.println("話す相手がいない");
						System.out.println();
						shop++;
					}
					}		
				}
				if(command1==6) {
					System.out.println(statas[0]+hp);
					System.out.println(statas[1]+off);
					System.out.println(statas[2]+def);
					System.out.println(statas[3]+luck);
					System.out.println(statas[4]+sumgold);
					System.out.println("Level"+level);
					System.out.println();
				}
				if(command1==9||days==0) {
					System.out.println("災厄との戦闘が開始した");
					System.out.println("敵とじゃんけんをします0(グー)1(パー)2(チョキ)");
					while(fight<1&&hp>=0) {
						int porson=s.nextInt();
						String[]janken={"グー","パー","チョキ"};
						int cpu=r.nextInt(3);
						if(porson==418&&talk1==3) {
							System.out.println("神父が助けにきた");
							System.out.println("神父の攻撃");
							System.out.println("災厄に"+(500*level)+"のダメージ");
							bosshp-=500*level;
							talk1++;
						}
						else if(porson==709&&talk2==3) {
							System.out.println("町の人々がやってきた");
							System.out.println("応援をしてくれた");
							System.out.println("全てのステータスが50上がった");
							hp+=50*level;
							off+=50*level;
							def+=50*level;
							luck=r.nextInt(10)+50*level;
							talk2++;
						}
						else if(porson==710&&talk3==3) {
							System.out.println("納豆を厄災に渡した");
							System.out.println("お前納豆くれるのか、いいやつじゃないか");
							System.out.println("ここ最近食べれなくてさありがとう");
							System.out.println("故郷に帰るよ。迷惑かけてすまなかったな");
							fight++;
							trust++;
						}	
						else if((cpu-porson==-1)||cpu-porson==2) {
							System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
							System.out.println("敵に　"+(off+luck-bossdef)+"のダメージを与えた");
							bosshp=bosshp-(off+luck-bossdef);
							
						}
						else if(cpu==porson) {
							System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
							System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
						}
						else if((porson-cpu==-1)||porson-cpu==2){
							System.out.println("敵は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
							System.out.println("あなたは　"+(bossoff+bossluck-hp)+"のダメージを受けた");
							hp=hp-(bossoff+bossluck-def);
						}	
						else{
							System.out.println("エラーが起こりました");
							System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
						}
						if(bosshp<=0) {
							System.out.println("あなたは災厄に勝利した");
							System.out.println("まさかこの私がやられるとはね、、、");
							System.out.println("これも運命かもしれない");
							fight++;
						}
						else if(hp<=0) {
							System.out.println("戦闘に負けた");
							System.out.println();
							die++;
						}
					}
					}
				if(die>=1) {
					System.out.println("ゲームオーバー");
				}
				else if(trust==1) {
					System.out.println("君には本当に感謝している");
					System.out.println("納豆をくれてありがとう");
					System.out.println("The　fin");
				}
				else if(labor>=100) {
					System.out.println("過労死した");
					System.out.println("ゲームオーバー");
					die++;
				}
			}
	}
}

	
									
						
					
			
			
			
			
			
			
	
	


