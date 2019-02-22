//
//  DelegateProtocol.h
//  Delegate
//
//  Created by Ivaldo De Sousa on 2018-10-01.
//  Copyright © 2018 Ivaldo De Sousa. All rights reserved.
//

#import <Foundation/Foundation.h>

@protocol DelegateProtocol <NSObject>

- (char) characterFunction;
- (int) numberOfLines;
- (NSString*) patternType;
@optional - (int) spaceBetweenCharacter;
@optional - (int) emptyLineBetweenLines;

@end
