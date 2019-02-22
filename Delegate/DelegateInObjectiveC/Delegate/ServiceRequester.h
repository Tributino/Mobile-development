//
//  ServiceRequester.h
//  Delegate
//
//  Created by Ivaldo De Sousa on 2018-10-01.
//  Copyright © 2018 Ivaldo De Sousa. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "PatternProvider.h"
#import "DelegateProtocol.h"

@interface ServiceRequester : NSObject<DelegateProtocol>

@property (nonatomic, strong) PatternProvider* provider;

- (void) setDelegate: (PatternProvider*) patternProvider;
- (char)characterFunction;
- (int)numberOfLines;
- (NSString *)patternType;

@end
