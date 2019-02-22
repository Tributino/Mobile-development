//
//  PatternProvider.m
//  Delegate
//
//  Created by Ivaldo De Sousa on 2018-10-01.
//  Copyright © 2018 Ivaldo De Sousa. All rights reserved.
//

#import "PatternProvider.h"

@implementation PatternProvider
- (void)draw
{
    int space = _delegate.spaceBetweenCharacter;
    int emptyLine = _delegate.emptyLineBetweenLines;
    char character = _delegate.characterFunction;
    int lines = _delegate.numberOfLines;
    NSString* pattern = _delegate.patternType;
    
    
    if ([pattern  isEqual: @"Triangle"]){
        for (int i=0;i<lines;i++){
            NSLog(@"%c",character);
            if (emptyLine>0){
                for (int i=0;i<emptyLine;i++){
                    NSLog(@"%s"," ");
                }
            }
        }
        
    }
    if ([pattern  isEqual: @"ReversedTriangle"]){
        for (int i=0;i<lines;i++){
            NSLog(@"%c",character);
            if (emptyLine>0){
                for (int i=0;i<emptyLine;i++){
                    NSLog(@"%s"," ");
                }
            }
        }
        
    }
    
    

}
@end
