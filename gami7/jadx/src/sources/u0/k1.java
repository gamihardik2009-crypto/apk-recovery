package u0;

import J.C0278m0;
import J.C0303z0;
import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import android.view.View;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import java.util.List;
import m2.C0880v;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class k1 implements androidx.lifecycle.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f11075h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0278m0 f11076i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f11077j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z2.s f11078k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f11079l;

    public k1(O2.e eVar, C0278m0 c0278m0, C0303z0 c0303z0, z2.s sVar, View view) {
        this.f11075h = eVar;
        this.f11076i = c0278m0;
        this.f11077j = c0303z0;
        this.f11078k = sVar;
        this.f11079l = view;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        boolean z3;
        int i2 = h1.f11056a[enumC0465n.ordinal()];
        InterfaceC0310g interfaceC0310g = null;
        if (i2 == 1) {
            J2.B.r(this.f11075h, null, 4, new j1(this.f11078k, this.f11077j, interfaceC0470t, this, this.f11079l, null), 1);
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                this.f11077j.t();
                return;
            } else {
                C0303z0 c0303z0 = this.f11077j;
                synchronized (c0303z0.f4302b) {
                    c0303z0.q = true;
                }
                return;
            }
        }
        C0278m0 c0278m0 = this.f11076i;
        if (c0278m0 != null) {
            J.S s3 = (J.S) c0278m0.f4159j;
            synchronized (s3.f4082b) {
                try {
                    synchronized (s3.f4082b) {
                        z3 = s3.f4081a;
                    }
                    if (!z3) {
                        List list = (List) s3.f4083c;
                        s3.f4083c = (List) s3.f4084d;
                        s3.f4084d = list;
                        s3.f4081a = true;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((InterfaceC1073d) list.get(i3)).t(C0880v.f8657a);
                        }
                        list.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0303z0 c0303z02 = this.f11077j;
        synchronized (c0303z02.f4302b) {
            if (c0303z02.q) {
                c0303z02.q = false;
                interfaceC0310g = c0303z02.u();
            }
        }
        if (interfaceC0310g != null) {
            interfaceC0310g.t(C0880v.f8657a);
        }
    }
}
