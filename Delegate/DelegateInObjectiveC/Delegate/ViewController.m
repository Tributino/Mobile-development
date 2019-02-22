//
//  ViewController.m
//  Delegate
//
//  Created by Ivaldo De Sousa on 2018-10-01.
//  Copyright © 2018 Ivaldo De Sousa. All rights reserved.
//

#import "ViewController.h"
#import "PatternProvider.h"
#import "ServiceRequester.h"
@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
   
PatternProvider *provider = [[PatternProvider alloc] init];
ServiceRequester *serviceRequester = [[ServiceRequester alloc] init];
[serviceRequester setDelegate: provider];
[provider draw];
    
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}




@end
