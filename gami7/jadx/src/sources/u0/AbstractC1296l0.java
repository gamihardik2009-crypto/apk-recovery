package u0;

import D.C0032a;
import J.C0257c;
import J.C0285q;
import J.C0287r0;
import J.C0291t0;

/* renamed from: u0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1296l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final J.X0 f11082a = new J.X0(O.q);

    /* renamed from: b, reason: collision with root package name */
    public static final J.X0 f11083b = new J.X0(O.f10947r);

    /* renamed from: c, reason: collision with root package name */
    public static final J.X0 f11084c = new J.X0(O.f10948s);

    /* renamed from: d, reason: collision with root package name */
    public static final J.X0 f11085d = new J.X0(O.f10949t);

    /* renamed from: e, reason: collision with root package name */
    public static final J.X0 f11086e = new J.X0(O.f10954y);

    /* renamed from: f, reason: collision with root package name */
    public static final J.X0 f11087f = new J.X0(O.f10950u);

    /* renamed from: g, reason: collision with root package name */
    public static final J.X0 f11088g = new J.X0(O.f10951v);

    /* renamed from: h, reason: collision with root package name */
    public static final J.X0 f11089h = new J.X0(O.f10953x);

    /* renamed from: i, reason: collision with root package name */
    public static final J.X0 f11090i = new J.X0(O.f10952w);

    /* renamed from: j, reason: collision with root package name */
    public static final J.X0 f11091j = new J.X0(O.f10955z);

    /* renamed from: k, reason: collision with root package name */
    public static final J.X0 f11092k = new J.X0(O.f10930A);

    /* renamed from: l, reason: collision with root package name */
    public static final J.X0 f11093l = new J.X0(O.f10931B);

    /* renamed from: m, reason: collision with root package name */
    public static final J.X0 f11094m = new J.X0(O.F);

    /* renamed from: n, reason: collision with root package name */
    public static final J.X0 f11095n = new J.X0(O.E);

    /* renamed from: o, reason: collision with root package name */
    public static final J.X0 f11096o = new J.X0(O.f10934G);

    /* renamed from: p, reason: collision with root package name */
    public static final J.X0 f11097p = new J.X0(O.f10935H);
    public static final J.X0 q = new J.X0(O.f10936I);

    /* renamed from: r, reason: collision with root package name */
    public static final J.X0 f11098r = new J.X0(O.f10937J);

    /* renamed from: s, reason: collision with root package name */
    public static final J.X0 f11099s = new J.X0(O.f10932C);

    /* renamed from: t, reason: collision with root package name */
    public static final J.B f11100t = new J.B(J.W.f4109m, O.f10933D);

    public static final void a(t0.f0 f0Var, C1274a0 c1274a0, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(874662829);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? c0285q.g(f0Var) : c0285q.i(f0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? c0285q.g(c1274a0) : c0285q.i(c1274a0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            C1314v c1314v = (C1314v) f0Var;
            C0287r0 a3 = f11082a.a(c1314v.getAccessibilityManager());
            C0287r0 a4 = f11083b.a(c1314v.getAutofill());
            C0287r0 a5 = f11084c.a(c1314v.getAutofillTree());
            C0287r0 a6 = f11085d.a(c1314v.getClipboardManager());
            C0287r0 a7 = f11087f.a(c1314v.getDensity());
            C0287r0 a8 = f11088g.a(c1314v.getFocusOwner());
            C0287r0 a9 = f11089h.a(c1314v.getFontLoader());
            a9.f4226f = false;
            C0287r0 a10 = f11090i.a(c1314v.getFontFamilyResolver());
            a10.f4226f = false;
            C0257c.b(new C0287r0[]{a3, a4, a5, a6, a7, a8, a9, a10, f11091j.a(c1314v.getHapticFeedBack()), f11092k.a(c1314v.getInputModeManager()), f11093l.a(c1314v.getLayoutDirection()), f11094m.a(c1314v.getTextInputService()), f11095n.a(c1314v.getSoftwareKeyboardController()), f11096o.a(c1314v.getTextToolbar()), f11097p.a(c1274a0), q.a(c1314v.getViewConfiguration()), f11098r.a(c1314v.getWindowInfo()), f11099s.a(c1314v.getPointerIconService()), f11086e.a(c1314v.getGraphicsContext())}, eVar, c0285q, ((i3 >> 3) & 112) | 8);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(f0Var, c1274a0, eVar, i2, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
