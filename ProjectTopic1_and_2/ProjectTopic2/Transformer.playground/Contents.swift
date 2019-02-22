//: Playground - noun: a place where people can play




class Transformer{
    var name: String
    var criterias: [String:Int] = ["Strength":0, "Intelligence":0, "speed": 0, "Endurence":0, "Rank":0, "Courage":0, "Firepower":0, "Skill":0]
    
    func overallRating()->Int{return criterias["Strength"]!+criterias["Intelligence"]!+criterias["speed"]!+criterias["Endurence"]!+criterias["Firepower"]!}
   
    init(name: String, criterias: [String:Int] ){
        self.name=name
        self.criterias=criterias
    }
    
    func showCriterias(){
        for (key,value) in criterias {
            print("\(key): \(value)")
        }
        
    }
    
    func compareByOverallRating(_ t: Transformer)->Int{
        
       if self.overallRating()-t.overallRating()>0{
            return 100
       }
        return -100
    }
    
    func compareByCriterias(_ T2: Transformer)-> Int{
    
        if self.criterias["Courage"]!-4>=T2.criterias["Courage"]! || self.criterias["Skill"]!-3>=T2.criterias["Skill"]!{
            return 100
        }
        else if T2.criterias["Courage"]!-4>=self.criterias["Courage"]! || T2.criterias["Skill"]!-3>=self.criterias["Skill"]!{
            return -100
        }
     
        return compareByOverallRating(T2)
        
    }
    
    
}


//-------------------------------- AUTOBOT TEAM ------------------------------------------------
// blaster = {8,8,2,8,7,9,7,9};
var blasterCriterias = ["Strength":8, "Intelligence":8, "speed": 2, "Endurence":8, "Rank":7, "Courage":9, "Firepower":7, "Skill":9]
//cloudraker = {6,6,8,6,5,7,6,6};
var cloudrakerCriterias = ["Strength":6, "Intelligence":6, "speed": 8, "Endurence":6, "Rank":5, "Courage":7, "Firepower":6, "Skill":6]
//fastlane = {6,3,6,6,5,9,7,7};
var fastlaneCriterias = ["Strength":6, "Intelligence":3, "speed": 6, "Endurence":6, "Rank":5, "Courage":9, "Firepower":7, "Skill":7]
//freeway = {3,6,4,6,6,8,3,9};
var freewayCriterias = ["Strength":3, "Intelligence":6, "speed":4, "Endurence":6, "Rank":6, "Courage":8, "Firepower":3, "Skill":9]
//grapple = {8,8,3,4,7,7,7,9};
var grappleCriterias = ["Strength":8, "Intelligence":8, "speed":3, "Endurence":4, "Rank":7, "Courage":7, "Firepower":7, "Skill":9]


let blaster = Transformer(name: "Blaster", criterias: blasterCriterias)
let cloudraker = Transformer(name: "Cloudraker", criterias: cloudrakerCriterias)
let fastlane = Transformer(name: "Fastlane", criterias: fastlaneCriterias)
let freeway = Transformer(name: "Freeway", criterias: freewayCriterias)
let grapple = Transformer(name: "Grapple", criterias: grappleCriterias)


//------------------------------------- DECEPTION TEAM -------------------------------------------
//barrage = {3,8,3,7,5,10,9,8};
var barrageCriterias = ["Strength":3, "Intelligence":8, "speed":3, "Endurence":7, "Rank":5, "Courage":10, "Firepower":9, "Skill":8]
//bombshell = {5,8,4,5,6,5,6,9};
var bombshellCriterias = ["Strength":5, "Intelligence":8, "speed":4, "Endurence":5, "Rank":6, "Courage":5, "Firepower":6, "Skill":9]
//breakdown = {6,7,7,5,6,8,6,6};
var breakdownCriterias = ["Strength":6, "Intelligence":7, "speed":7, "Endurence":5, "Rank":6, "Courage":8, "Firepower":6, "Skill":6]
//chopShop = {7,8,4,5,6,7,6,10};
var chopShopCriterias = ["Strength":7, "Intelligence":8, "speed":4, "Endurence":5, "Rank":6, "Courage":7, "Firepower":6, "Skill":10]

let barrage = Transformer(name: "Barrage", criterias: barrageCriterias)
let bombshell = Transformer(name: "Bombshell", criterias: bombshellCriterias)
let breakdown = Transformer(name: "Breakdown", criterias: breakdownCriterias)
let chopShop = Transformer(name: "ChopShop", criterias: chopShopCriterias)


//______________________________________________________________________________________________________________________



//--------------------------------------- ENUM ------------------------------------------------------

enum Gang: String{
    case Autobot, Deception
}

//-------------------------------------------------------------------------------------------------------

class Team{
    var gangName: Gang
    var team: [Transformer]
    var winner = true
    var survivors: [Transformer] = []
    
    init(gangName: Gang, team: Array<Transformer> ){
        self.gangName=gangName
        self.team=team
    }

  
}

let autobotsFights: Array<Transformer> = [blaster, cloudraker, fastlane, freeway, grapple]

let deceptionFights: Array<Transformer> = [barrage, bombshell, breakdown, chopShop]

var autobotsTeam = Team(gangName: Gang.Autobot, team: autobotsFights)

var deceptionTeam = Team(gangName: Gang.Deception, team: deceptionFights)


class FightingArena {
    var Autobots: Team = autobotsTeam
    var Deceptions: Team = deceptionTeam
    var numberOfBattles = min(autobotsTeam.team.count, deceptionTeam.team.count)
    
    func preSurvivors()->Void{
        if self.Autobots.team.count>self.numberOfBattles{
            for i in self.numberOfBattles..<self.Autobots.team.count{
                self.Autobots.survivors.append(self.Autobots.team[i])
                break
            }
        }
        if self.Deceptions.team.count>self.numberOfBattles{
            for i in self.numberOfBattles..<self.Deceptions.team.count{
                self.Deceptions.survivors.append(self.Deceptions.team[i])
            }
        }
    }
    
    func compareByNameAndCriterias(transformers: (T1: Transformer,T2: Transformer))-> (Int,Int){
        
        switch transformers{
        case let (T1,T2) where (T1.name=="Optimus Prime" || T1.name=="Predaking") && !((T2.name=="Optimus Prime") || (T2.name=="Predaking")):
            return (100,-100)
        case let (T1,T2) where (T2.name=="Optimus Prime" || T2.name=="Predaking") && !((T1.name=="Optimus Prime") || (T1.name=="Predaking")):
            return (-100,100)
        case let (T1,T2) where (!(T2.name=="Optimus Prime") && !(T2.name=="Predaking")) && (!(T1.name=="Optimus Prime") && !(T1.name=="Predaking")):
            return (T1.compareByCriterias(T2), T2.compareByCriterias(T1))
        default:
            return (0,0)
        }
    }
    
    
    func fight()->Void{
        var x: Int
        var y: Int
        for i in 0..<self.numberOfBattles{
            (x ,y) = compareByNameAndCriterias(transformers: (Autobots.team[i], Deceptions.team[i]))
            
            if x == 100{
                self.Autobots.survivors.append(Autobots.team[i])
            }
            if y == 100{
                self.Deceptions.survivors.append(Deceptions.team[i])
            }
            if x == 0{
                Deceptions.survivors.removeAll()
                Autobots.survivors.removeAll()
                break
            }
        }
    }
    
    func theWinner()->Void{
        if Deceptions.survivors.count > Autobots.survivors.count{
            Deceptions.winner=true
            Autobots.winner=false
            print("The Deceptions won the battle, they will destroy the world.")
        }
        else if Autobots.survivors.count > Deceptions.survivors.count{
            Deceptions.winner=false
            Autobots.winner=true
            print("The Autobots won the battle, they save the world against the Deceptions")
        }
        else if Autobots.survivors.count==Deceptions.survivors.count && Autobots.survivors.count==0{
            Deceptions.winner=false
            Autobots.winner=false
            print("There are no survivors")
        }
        else{
            print("we have a draw")
            Deceptions.winner=false
            Autobots.winner=false
        }
    }
    
    
    func run(){
        preSurvivors()
        fight()
        theWinner()
        print("----------------------------------The duels----------------------------------------------")
        for i in 0..<numberOfBattles{
            print("\(Autobots.team[i].name) vs \(Deceptions.team[i].name) = \(compareByNameAndCriterias(transformers: (Autobots.team[i], Deceptions.team[i])))")
        }
        print("")
        print("----------------------------------Autobot Survivors--------------------------------------")
        for i in Autobots.survivors{
            print(i.name)
        }
        print("----------------------------------Deception Suvivors-------------------------------------")
        for i in Deceptions.survivors{
            print(i.name)
        }
    }
    
  
}

    
var arena = FightingArena()
arena.run()




