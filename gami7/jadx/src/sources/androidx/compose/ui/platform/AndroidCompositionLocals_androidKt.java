package androidx.compose.ui.platform;

import H.C0157n1;
import H.C0213w0;
import H.F0;
import J.AbstractC0286q0;
import J.B;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0287r0;
import J.C0291t0;
import J.InterfaceC0258c0;
import J.W;
import J.X0;
import R.b;
import S.j;
import S.k;
import S.l;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.M;
import com.example.bulksmsscheduler.R;
import j1.AbstractC0777e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m2.C0880v;
import n0.C0919B;
import p.C1007b;
import u0.AbstractC1296l0;
import u0.C1274a0;
import u0.C1295l;
import u0.C1297m;
import u0.C1304p0;
import u0.C1306q0;
import u0.C1314v;
import u0.O;
import u0.P;
import u0.Q;
import u1.f;
import y0.C1397a;
import y0.C1398b;
import y2.c;
import y2.e;
import z2.h;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final B f6780a = new B(W.f4109m, O.f10940j);

    /* renamed from: b, reason: collision with root package name */
    public static final X0 f6781b = new X0(O.f10941k);

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f6782c = new X0(O.f10942l);

    /* renamed from: d, reason: collision with root package name */
    public static final X0 f6783d = new X0(O.f10943m);

    /* renamed from: e, reason: collision with root package name */
    public static final X0 f6784e = new X0(O.f10944n);

    /* renamed from: f, reason: collision with root package name */
    public static final X0 f6785f = new X0(O.f10945o);

    public static final void a(C1314v c1314v, e eVar, C0285q c0285q, int i2) {
        boolean z3;
        c0285q.W(1396852028);
        int i3 = (i2 & 6) == 0 ? (c0285q.i(c1314v) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            Context context = c1314v.getContext();
            Object K3 = c0285q.K();
            Object obj = C0275l.f4150a;
            if (K3 == obj) {
                K3 = C0257c.N(new Configuration(context.getResources().getConfiguration()), W.f4109m);
                c0285q.e0(K3);
            }
            InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
            Object K4 = c0285q.K();
            if (K4 == obj) {
                K4 = new C0213w0(interfaceC0258c0, 3);
                c0285q.e0(K4);
            }
            c1314v.setConfigurationChangeObserver((c) K4);
            Object K5 = c0285q.K();
            if (K5 == obj) {
                K5 = new C1274a0();
                c0285q.e0(K5);
            }
            C1274a0 c1274a0 = (C1274a0) K5;
            C1295l viewTreeOwners = c1314v.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object K6 = c0285q.K();
            f fVar = viewTreeOwners.f11081b;
            if (K6 == obj) {
                Object parent = c1314v.getParent();
                h.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = j.class.getSimpleName() + ':' + str;
                u1.e c3 = fVar.c();
                Bundle a3 = c3.a(str2);
                if (a3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a3.keySet()) {
                        ArrayList parcelableArrayList = a3.getParcelableArrayList(str3);
                        h.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        a3 = a3;
                    }
                }
                C1297m c1297m = C1297m.f11111m;
                X0 x02 = l.f5571a;
                k kVar = new k(linkedHashMap, c1297m);
                try {
                    c3.c(str2, new M(2, kVar));
                    z3 = true;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                Object c1304p0 = new C1304p0(kVar, new C1306q0(z3, c3, str2));
                c0285q.e0(c1304p0);
                K6 = c1304p0;
            }
            Object obj2 = (C1304p0) K6;
            C0880v c0880v = C0880v.f8657a;
            boolean i4 = c0285q.i(obj2);
            Object K7 = c0285q.K();
            if (i4 || K7 == obj) {
                K7 = new C0919B(13, obj2);
                c0285q.e0(K7);
            }
            C0257c.d(c0880v, (c) K7, c0285q);
            Configuration configuration = (Configuration) interfaceC0258c0.getValue();
            Object K8 = c0285q.K();
            if (K8 == obj) {
                K8 = new C1397a();
                c0285q.e0(K8);
            }
            C1397a c1397a = (C1397a) K8;
            Object K9 = c0285q.K();
            Object obj3 = K9;
            if (K9 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0285q.e0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object K10 = c0285q.K();
            if (K10 == obj) {
                K10 = new P(configuration3, c1397a);
                c0285q.e0(K10);
            }
            P p3 = (P) K10;
            boolean i5 = c0285q.i(context);
            Object K11 = c0285q.K();
            if (i5 || K11 == obj) {
                K11 = new C1007b(context, 9, p3);
                c0285q.e0(K11);
            }
            C0257c.d(c1397a, (c) K11, c0285q);
            Object K12 = c0285q.K();
            if (K12 == obj) {
                K12 = new C1398b();
                c0285q.e0(K12);
            }
            C1398b c1398b = (C1398b) K12;
            Object K13 = c0285q.K();
            if (K13 == obj) {
                K13 = new Q(c1398b);
                c0285q.e0(K13);
            }
            Q q = (Q) K13;
            boolean i6 = c0285q.i(context);
            Object K14 = c0285q.K();
            if (i6 || K14 == obj) {
                K14 = new C1007b(context, 10, q);
                c0285q.e0(K14);
            }
            C0257c.d(c1398b, (c) K14, c0285q);
            AbstractC0286q0 abstractC0286q0 = AbstractC1296l0.f11100t;
            C0257c.b(new C0287r0[]{f6780a.a((Configuration) interfaceC0258c0.getValue()), f6781b.a(context), AbstractC0777e.f8096a.a(viewTreeOwners.f11080a), f6784e.a(fVar), l.f5571a.a(obj2), f6785f.a(c1314v.getView()), f6782c.a(c1397a), f6783d.a(c1398b), abstractC0286q0.a(Boolean.valueOf(((Boolean) c0285q.l(abstractC0286q0)).booleanValue() | c1314v.getScrollCaptureInProgress$ui_release()))}, b.c(1471621628, new F0((Object) c1314v, (Object) c1274a0, eVar, 6), c0285q), c0285q, 56);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 11, c1314v, eVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0286q0 getLocalLifecycleOwner() {
        return AbstractC0777e.f8096a;
    }
}
