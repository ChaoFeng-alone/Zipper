import sun.reflect.generics.tree.Tree;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //System.out.println("DirectionsInthissectionyouaregoingtoreadapassagewithtenstatementsattachedtoitEachstatementcontainsinformationgiveninoneoftheparagraphsIdentifytheparagraphfromwhichtheinformationisderivedYoumaychooseaparagraphmorethanonceEachparagraphismarkedwithaletterAnswerthequestionsbymarkingthecorrespondingletteronAnswerSheetDeborahKennysBorntoRiseTellsStoryofHarlemVillageAcademiesADeborahKennyCEOoftheHarlemVillageAcademiesisfrustratedwiththenationscurrenteducationsystemUnlikemostthoughshedecidedtodosomethingaboutitPartdeclarationpartrecordherbookBorntoRisewritesdownherjourneytowardcreatingandrunningherownsystemofprogressivecharterschoolsinHarleminNewYorkCityWhatisyoureducationalphilosophyBWewantourstudentstoreceivethesamehighqualityeducationasstudentswhoareprivilegedtoattendthebestprivateschoolsinthecountryPersonallyIbelieveaprogressiveeducationissuperioraslongasitsdeliveredbyreallysmarttalentedteacherswhoknowhowtoexecutewellItsasophisticatedapproachthatreallyonlyworkswellinthehandsofareallysophisticatededucatorWeredealingwithalittlebitofachallengebecausestudentsenterthisschoolfromtheregularpublicsystemAndwhentheyenterinfifthgradetheyrenotyetwelltrainedinthebasicsreadingwritingandmathwhichmeansthatwehavetocatchthemuponbasicmathskillsonthebasicsofwritingAndmanyofthemcomeinatakindergartenfirstsecondgradelevelinreadingSowehavetoacceleratetheirmasteryofthebasicsbutwerejecttheideathatifyoudothatyoucantteachthatatahighlevelWepushourselvesconstantlytothinkabouthowwecanmakesurethatourstudentswillcatchupwhileweteachatthehighestpossiblelevelItmeansaskingdifficultdelicatequestionsnotacceptingananswerthatisnotbackedupbyevidencethekindsofthingsthatyouwouldexpecttoseeinthebestprivateschoolsWeaimforahighlevelinrichdiscussionswherethestudentsareaskedtoanalyzeachallengingtextandwheretheteacherdoesnotacceptjustanyanswersimplybecausethestudentisbehavingWhatmakestheHarlemVillageAcademiesdifferentCFirstofallIhavetosaywhatwehaveincommonwithothercharterschoolsbecausewehavelearnedsomuchfromthemcreatinganexpectationthatallstudentswillattendcollegenamingclassroomsaftercollegesthelongerschooldaythelongerschoolyearIfeelitsimportanttogivecreditwherecreditisduebecauseIlearnedfromthemInthoseearlyyearswhenIopenedtheschoolmostoftheseotherschoolsbadbeenaroundforsevenyearstenyearssomeofthemevenlongerDAsfaraswhatmakesusdifferentIlltellyouwhattheteacherssayteacherstellusthatthelevelofprofessionalismandpassionforteachingatahighlevelandteachingabovethetestnottothetestandworkinginanenvironmentwhereeverybodyistrustedtodotheirjobandcontinuallylearningtheresthisincrediblecultureoflearningTheresthisincredibleworkplaceculturewheretheadultsarecontinuallybecomingbetterandlearningmoreabouthowtobecomeabetterleadherTheteachersgettomakeallofthedecisionsabouttheirownprofessionaldevelopmentratherthanbeingenforcedtoattendthetrainingTheyaretreatedlikeprofessionalgradedoctorsandlawyersattheHighestlevelTheyactuallymakethedecisionsnotonlyaboutwhatbookstouseandwhatteaehingmethedbutevenaboutwhattheirownprofessionaldevelopmentIoukslikeTheresaveryclearsetofstandardsfarwhatthestudentsneedtoknowandbeabletodoattheendofeachyearandquarterandweholdpeopleaccountableforthatendgoalButwegivethemcompletefreedomtodecidehowtheyregoingtoachieveitwhichishowallprofessionalsaretreatedUnfortunatelyitsnothowmostteachersaretreatedinthiscountryMostteachersaretreatedlikefactoryworkerswheretheresahigsetofrulesonhowtheyhavetodoeverythingWhatdoesthecurriculumlooklikeatHarlemVillageAcademyschoolsEItlookslikeaclassicliberalartscurriculumwheremathreadingandwritingarenottheonlysubjectstaughtEvenifthestatefocusesitstestingonthosethingswedonotletthestatedictateourcurriculumWeareinterestedinarichcurriculumthatincludesartandmusicandseienceandsocialstudiesandawidevarietyofelectivesandcharactereducationisintegratedthroughoutHowdoyouaddressthecriticismspeoplehaveregardingcharterschoolsFIdsaythatthemaincriticismsarestemmingfromthefactthatinachartersystemtheteachersarenotunionizedandtheyretreatedasprofessionalsinsteadofasmanuallaborersThechartermovementischallengingthecurrentsituationitseomingalongandsayingweusedtocompletelychangetheunderlyingpremiereofhowwegoaboutpubliceducationParentsshouldbeabletochoosethescherziWeshouldgivepowertoallparentsregardlessofsocioeonomieleveltochoosewheretheysendtheirchildandthatcreatesmarketcompetitionifyouhaveanamazingschoolwithcaringteachersandgreatresultsparentsaregoingtoanttochoosethatschoolThechartermovementisputtingtheneedsofchildrenfirstantiisholdingteachersaccountableItehalleugesthenotionoftenurewheretheresnoaccountabilityatallWhatsnextforyouandtheHarlemVillageAcademiesGWearegoingtotripleinsizeinthenexttwnyearsWewillhaveafullKsystemWerestartingtwonewelementaryschoolswewillbeservingchildrenbutwearenoteagertogrowsuperbigWewanttousetheplatformofwhatwerelearnedandtheresultsthatweveproducedthatantteachershaveproducedtohaveanationalinfluenceonpolicyandonteachingmethodsThelawsthatgovernhowschoolsrunconstraintheabilityoftheprintcipaltoruntheschoolwellTheyrenotallowedtobuildateamAndbuildingateamwhereteachersaretrustedhappyandcooperativeisreallythefoundationforanexcellentschoolSowewanttofindawaytogetourmessageoutnationallyandcontinuetobepartofthemovementIntheHarlemVillageAcademiesteacherscandecidethemselveshowtheyaregoingtoachievetheteachingobjectivesThechartermovementchallengesthetenuresysteminmakingchildrensneedsapriorityandholdingteachersresponsibleTheHarlemVillageAcademieswillbeabletoenrollehildreninthenexttwoyearsDeborahKennyadmitsthatshelearnsalotfromothercharterschoolsThecurriculumatHarlemVillageAcademiesnotonlyincludesthesubjectsfrequentlytestedTheHarlemVillageAcademiesareeagertoexertanationalinfluenceonpolicyandteachingmethodsStudentsenteringtheHarlemVillageAcademiesarefromtheregularpublicsystemDeborahKennydecidestocreateandruntheHarlemVillageAcademiesbecausesheisdisappointedaboutthecurrenteducationsystemCharterschoolsaremainlycriticizedfortreatingtheteachersasprofessionalsOneofthechallengesfacingtheHarlernVillageAcademiesishowtoacceleratestudentsmasteryofthebasics".toUpperCase());

        int weight[] = {816, 149, 278, 425, 127, 222, 201, 609, 696, 15, 77, 402, 240, 674, 750, 192, 9, 598, 632, 905, 275, 97, 236, 15, 197, 7};
//        int weight[]={816,149,278,425,127};

        Huffman huf = new Huffman();
        huf.creatHuffmanTree(weight);

        FileReader filein = null;
        DataOutputStream fileout = null;

        try {
            filein = new FileReader("in.txt");
            File tmp = new File("out.cf");
            if (!tmp.exists())
                tmp.createNewFile();
            fileout = new DataOutputStream(new FileOutputStream(tmp));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer[] arrs = new Integer[]{};
        int fr;
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            while ((fr = filein.read()) != -1) {
                arr.add(fr);
            }
            arrs = arr.toArray(new Integer[]{});
        } catch (IOException e) {
            e.printStackTrace();
        }

        //开始压缩处理，每次处理1000个字符
        //原文长度,arrs为读取的原文
        int arrslength = arrs.length;
        //tmp为获取的原文密码串
        StringBuilder tmp;
        int tmplength;
        byte tmpwrite;
        byte tmpit;
        String tmpstring;
        try {
            for (int i = 0; i < arrslength; i++) {
                tmp=new StringBuilder();
                for (int j = 0; j < 1000; j++) {
                    tmp.append(huf.getcode(arrs[i*1000+j]));
                }
                tmplength = tmp.length();
                for (int j = 0; j < tmplength; j++) {
                    for (int k = 0; k < 8; k++) {

                    }
                }
                tmpwrite=0;

            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("已经转换完成");
        }


        //解压检查
        DataInputStream fileinchack;
        FileWriter fileoutchack;
        try {
            fileinchack = new DataInputStream(new FileInputStream("out.cf"));
            File f = new File("out.txt");
            if (!f.exists())
                f.createNewFile();
            fileoutchack = new FileWriter(f);
            byte[] in = new byte[10086];
            fileinchack.read(in);
            //节点变量
            TreeNode chack = huf.tree;
            for (byte i : in) {
                if (chack.rchild == null && chack.lchild == null) {
                    fileoutchack.write(chack.name);
                    chack = huf.tree;
                    continue;
                }
                if (i == 48)
                    chack = chack.lchild;
                else if (i == 49)
                    chack = chack.rchild;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            fileoutchack.close();
        }

    }
}
