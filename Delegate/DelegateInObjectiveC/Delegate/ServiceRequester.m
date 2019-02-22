//
//  ServiceRequester.m
//  Delegate
//
//  Created by Ivaldo De Sousa on 2018-10-01.
//  Copyright © 2018 Ivaldo De Sousa. All rights reserved.
//

#import "ServiceRequester.h"

@implementation ServiceRequester


- (void) setDelegate: (PatternProvider*) patternProvider{
    self.provider.delegate=self;
}

- (char)characterFunction {
    return '*';
}

- (int)numberOfLines {
    return 7;
}

- (NSString *)patternType {
    return @"ReversedTriangle";
}


@end
