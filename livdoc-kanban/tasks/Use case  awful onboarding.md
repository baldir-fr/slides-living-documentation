Tell the story of an awful onboarding.

Ask the audience what they think

-> word cloud

## An onboarding story

First day of a new adventure.
After meeting my new colleagues, I am given a laptop on which a post-it with my credentials are written.

I open my session and check out my email. I read my welcome email.

Of course, I don't have all my access credentials for the Git repository. I am told that "it will take some time", in the meantime go look at "The Wiki" to learn about the stuff we make here.

In "The Wiki" I find a link to a shared folder where the specs should be located.

I make a ticket to request a MS Office licence so I can open the Word document.

While waiting the approval for my ticket, I continue to browse "The Wiki" for more information. I find a typo in one of the wiki pages. Since I have nothing yet to do, I decide to propose a correction.

But I have no rights to modify the page. I ask why. You don't have the right credentials yet. But you can add a comment, and we will fix it when we have time (it was never fixed).

I have an answer for my request to install the MS Office suite. We don't have enough licences yet (we cannot give away licences like this). Do you really need it? I give up and ask a kind colleague to open the file for me and save it as a Pdf.

When I open it I see that it is not the right version. I ask my colleague again to convert it as PDF. She tells me that she won't do it again and by the way, it is not very up to date. It is a pain to update those documents and nobody really reads it anyway.

I check the PDF, and find some useful stuff but screenshots are taken on Windows XP, and Internet Explorer 9. I guess it's a little outdated...

Finally I can checkout the code form a git repository.

The technical stack that was presented in the word/pdf spec has almost completely changed. versions were bumped, libs were replaced...

I look at the folder structure to know a bit better what's it is about.

![](../Screenshot_20220517-105047.png)

![](../Screenshot_20220517-105103.png)

![](../Screenshot_20220517-105118.png)

Okay... This application must be about visiting printers factories. They must be really professional because they have a specific module in the code to modelize their visitation strategy... I guess.
> My assumption: module names reflects business


I ask a collegue why we have such an application in an insurance company. Do insurance companies really have factories?

My colleague look at me with big eyes... Don't you know design patterns?

I answer yea, of course there is this Singleton thing. Why?
> Implicit knowledge: can be understood only if you know it first.


I ask: why is it the first thing I see?
Colleague: We are using a technical separation of code. 
Me: why is that?
Colleague: I don't know, that is what we do. 
> Convention
> No rationale behind it

Colleague: We do it everywhere, that way we don't have surprises.
> Idiomatic

Me: where is the business code? 
Colleague: In each technical module you may have some bits of business here and there.
> Knowledge is scattered around the place

Me: it must be hard to test?
Colleague: yea, we tried to do tests but each time we changed something the tests were broken. So we used mocks everywhere, but it was worse, we now maintained the mocks and bugs were found in production anyway.
So now we do mostly end 2 end tests. They are flaky sometimes so we added sleeps to make sure the app had time to respond. Also we must run them in the same order and only one test suite at the time. We have a person full time for that.
> Human dedication (anti-pattern)

They are worth the effort though, because they actually do test the businesses cases. When we send the test reports to the business they complain because it's all about clicks, fields and forms. They wish it was more human readable.

Colleague: also if you want to know the use cases, you can check user stories in Jira 
Me: opens an old Jira User story. It does not to exactly the thing the app does today.
Colleague: yea, this one has been changed by a new user story. You are lucky you asked le since I was the obe that implemented it.

Me: not everyone knows what the app does?
Colleague: no, each of us has a perimeter in the application. The Dba, the frontend people, the backend people.  On this one, there is some caching features, so it was assigned to me.

For the features, just look at jira user stories, it's all here.



When I open the drive folder I see:

```
PNX_2019-02_SPC_v3.doc

```
