// Copyright 2016-2022, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package examples

import (
	"bufio"
	"os"
	"regexp"
	"runtime"
	"testing"
)

func TestEmbeddedTZData(t *testing.T) {
	if runtime.GOOS != "linux" && runtime.GOOS != "darwin" {
		t.Skip("Checking for embedded tzdata is only supported on GOOS=linux and GOOS=darwin builds")
	}
	bin := "../bin/pulumi-resource-pagerduty"
	f, err := os.Open(bin)
	if os.IsNotExist(err) {
		t.Errorf("built provider not found: %q, try running make provider first", bin)
		t.FailNow()
	}
	if err != nil {
		t.Error(err)
		t.FailNow()
	}
	t.Cleanup(func() {
		err := f.Close()
		if err != nil {
			t.Error(err)
			t.FailNow()
		}
	})
	// Heuristic to detect embedded tzdata:
	// https://cs.opensource.google/go/go/+/refs/tags/go1.20.5:src/time/tzdata/zipdata.go
	searchString := "Africa/BrazzavilleTZif2"
	matched, err := regexp.MatchReader(searchString, bufio.NewReader(f))
	if err != nil {
		t.Error(err)
		t.FailNow()
	}
	if !matched {
		t.Errorf("%s does not contain %q, are you sure `time/tzdata` is imported?", bin, searchString)
	}
}
