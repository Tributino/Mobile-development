//: Playground - noun: a place where people can play

import Foundation


protocol DelegateProtocol: AnyObject {
    
    
    func characterFunction() -> Character
    func numberOfLines() -> Int
    func patternType() -> String
    func spaceBetweenCharacter() -> Int
    func emptyLineBetweenLines() -> Int
}

extension DelegateProtocol{
    func spaceBetweenCharacter() -> Int{return 2}
    func emptyLineBetweenLines() -> Int{return 2}
    
}
class PatternProvider{
    
    
   public weak var delegate: DelegateProtocol?
    
    
    func printCharacter(_ a: Int,_ c: String){
         print(String(repeating: c, count: a))
    }
    
    
    public func draw()
    {
        let space: Int? = self.delegate?.spaceBetweenCharacter()
        
        let emptyLine: Int? = self.delegate?.emptyLineBetweenLines()
        
        let character: Character? = self.delegate?.characterFunction()
        
        let lines: Int? = self.delegate?.numberOfLines()
        
        let pattern: String? = self.delegate?.patternType()
        
        let newCharacter: String? = String(character!) + String(repeating: " ", count: space!)
        
        
        if pattern! == "Triangle"{
            for i in 1...lines!{
                printCharacter(i, newCharacter!)
                if emptyLine!>0{
                    for _ in 1...emptyLine!{
                        print("")
                    }
                }
            }
            
        }
        if pattern! == "ReversedTriangle"{
            for i in (1...lines!).reversed(){
                printCharacter(i, newCharacter!)
                if emptyLine!>0{
                    for _ in 1...emptyLine!{
                        print("")
                    }
                }
                
            }
        }
    }
    
}


class ServiceRequester: DelegateProtocol{
    
    var provider: PatternProvider
    
    init(provider: PatternProvider) {
        self.provider = provider
    }
    
    public func characterFunction() -> Character{
        return "*"
    }
    
    public func numberOfLines() -> Int{
        return 7
    }
    
    public func patternType() -> String {
        return "ReversedTriangle"
        
    }
    
    func setDelegate(_ patternProvider:PatternProvider){
        self.provider.delegate = self
    }
}


let patternProvider = PatternProvider()
var serviceRequester = ServiceRequester(provider: patternProvider)
serviceRequester.setDelegate(patternProvider)
patternProvider.draw()


