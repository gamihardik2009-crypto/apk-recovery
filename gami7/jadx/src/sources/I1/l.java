package I1;

import android.content.Context;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final f f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3954b;

    /* renamed from: c, reason: collision with root package name */
    public final f f3955c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3956d;

    public l(Context context, N1.b bVar) {
        Context applicationContext = context.getApplicationContext();
        z2.h.e(applicationContext, "context.applicationContext");
        z2.h.f(bVar, "taskExecutor");
        a aVar = new a(applicationContext, bVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        z2.h.e(applicationContext2, "context.applicationContext");
        z2.h.f(bVar, "taskExecutor");
        a aVar2 = new a(applicationContext2, bVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        z2.h.e(applicationContext3, "context.applicationContext");
        String str = j.f3951a;
        z2.h.f(bVar, "taskExecutor");
        i iVar = new i(applicationContext3, bVar);
        Context applicationContext4 = context.getApplicationContext();
        z2.h.e(applicationContext4, "context.applicationContext");
        z2.h.f(bVar, "taskExecutor");
        a aVar3 = new a(applicationContext4, bVar, 2);
        z2.h.f(bVar, "taskExecutor");
        this.f3953a = aVar;
        this.f3954b = aVar2;
        this.f3955c = iVar;
        this.f3956d = aVar3;
    }
}
