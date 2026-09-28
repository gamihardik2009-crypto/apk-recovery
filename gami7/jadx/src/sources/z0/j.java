package z0;

import A0.q;
import A0.r;
import J.C0257c;
import J.C0274k0;
import J.W;
import J2.B;
import a.AbstractC0423a;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import c0.AbstractC0571K;
import java.util.Comparator;
import java.util.function.Consumer;
import n2.AbstractC0960l;
import n2.AbstractC0962n;
import q2.InterfaceC1078i;
import r0.AbstractC1108W;
import r0.InterfaceC1129r;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C0274k0 f11883a = C0257c.N(Boolean.FALSE, W.f4109m);

    public final void a(View view, r rVar, InterfaceC1078i interfaceC1078i, Consumer<ScrollCaptureTarget> consumer) {
        L.d dVar = new L.d(new k[16]);
        AbstractC0962n.s(rVar.a(), 0, new i(dVar));
        final y2.c[] cVarArr = {d.f11865k, d.f11866l};
        dVar.p(new Comparator() { // from class: p2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c[] cVarArr2 = cVarArr;
                h.f(cVarArr2, "$selectors");
                for (c cVar : cVarArr2) {
                    int g3 = AbstractC0960l.g((Comparable) cVar.l(obj), (Comparable) cVar.l(obj2));
                    if (g3 != 0) {
                        return g3;
                    }
                }
                return 0;
            }
        });
        k kVar = (k) (dVar.k() ? null : dVar.f4618h[dVar.f4620j - 1]);
        if (kVar == null) {
            return;
        }
        O2.e a3 = B.a(interfaceC1078i);
        q qVar = kVar.f11884a;
        O0.i iVar = kVar.f11886c;
        f fVar = new f(qVar, iVar, a3, this);
        InterfaceC1129r interfaceC1129r = kVar.f11887d;
        b0.d D3 = AbstractC1108W.g(interfaceC1129r).D(interfaceC1129r, true);
        long m3 = AbstractC0423a.m(iVar.f5143a, iVar.f5144b);
        ScrollCaptureTarget d3 = D0.k.d(view, new Rect(Math.round(D3.f7060a), Math.round(D3.f7061b), Math.round(D3.f7062c), Math.round(D3.f7063d)), new Point((int) (m3 >> 32), (int) (m3 & 4294967295L)), fVar);
        d3.setScrollBounds(AbstractC0571K.x(iVar));
        consumer.accept(d3);
    }
}
