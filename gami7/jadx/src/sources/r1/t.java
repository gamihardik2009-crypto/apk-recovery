package r1;

import J2.B;
import J2.C0311h;
import J2.InterfaceC0310g;
import com.example.bulksmsscheduler.data.AppDatabase;
import q2.C1074e;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f10003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0310g f10004i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f10005j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f10006k;

    public t(InterfaceC1078i interfaceC1078i, C0311h c0311h, AppDatabase appDatabase, u uVar) {
        this.f10003h = interfaceC1078i;
        this.f10004i = c0311h;
        this.f10005j = appDatabase;
        this.f10006k = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0310g interfaceC0310g = this.f10004i;
        try {
            B.u(this.f10003h.h(C1074e.f9782h), new s(this.f10005j, interfaceC0310g, this.f10006k, null));
        } catch (Throwable th) {
            interfaceC0310g.H(th);
        }
    }
}
