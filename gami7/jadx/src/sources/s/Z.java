package s;

import T.C0374b;
import android.os.Build;
import android.view.View;
import b1.AbstractC0527d;
import b1.C0521S;
import b1.C0528e;
import com.example.bulksmsscheduler.R;
import j.C0736B;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f10091u = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C1164c f10092a = C1165d.b("captionBar", 4);

    /* renamed from: b, reason: collision with root package name */
    public final C1164c f10093b;

    /* renamed from: c, reason: collision with root package name */
    public final C1164c f10094c;

    /* renamed from: d, reason: collision with root package name */
    public final C1164c f10095d;

    /* renamed from: e, reason: collision with root package name */
    public final C1164c f10096e;

    /* renamed from: f, reason: collision with root package name */
    public final C1164c f10097f;

    /* renamed from: g, reason: collision with root package name */
    public final C1164c f10098g;

    /* renamed from: h, reason: collision with root package name */
    public final C1164c f10099h;

    /* renamed from: i, reason: collision with root package name */
    public final C1164c f10100i;

    /* renamed from: j, reason: collision with root package name */
    public final X f10101j;

    /* renamed from: k, reason: collision with root package name */
    public final X f10102k;

    /* renamed from: l, reason: collision with root package name */
    public final X f10103l;

    /* renamed from: m, reason: collision with root package name */
    public final X f10104m;

    /* renamed from: n, reason: collision with root package name */
    public final X f10105n;

    /* renamed from: o, reason: collision with root package name */
    public final X f10106o;

    /* renamed from: p, reason: collision with root package name */
    public final X f10107p;
    public final X q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10108r;

    /* renamed from: s, reason: collision with root package name */
    public int f10109s;

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC1149B f10110t;

    public Z(View view) {
        C1164c b3 = C1165d.b("displayCutout", 128);
        this.f10093b = b3;
        C1164c b4 = C1165d.b("ime", 8);
        this.f10094c = b4;
        C1164c b5 = C1165d.b("mandatorySystemGestures", 32);
        this.f10095d = b5;
        this.f10096e = C1165d.b("navigationBars", 2);
        this.f10097f = C1165d.b("statusBars", 1);
        C1164c b6 = C1165d.b("systemBars", 7);
        this.f10098g = b6;
        C1164c b7 = C1165d.b("systemGestures", 16);
        this.f10099h = b7;
        C1164c b8 = C1165d.b("tappableElement", 64);
        this.f10100i = b8;
        X x2 = new X(new C1152E(0, 0, 0, 0), "waterfall");
        this.f10101j = x2;
        new V(new V(b6, b4), b3);
        new V(new V(new V(b8, b5), b7), x2);
        this.f10102k = C1165d.d("captionBarIgnoringVisibility", 4);
        this.f10103l = C1165d.d("navigationBarsIgnoringVisibility", 2);
        this.f10104m = C1165d.d("statusBarsIgnoringVisibility", 1);
        this.f10105n = C1165d.d("systemBarsIgnoringVisibility", 7);
        this.f10106o = C1165d.d("tappableElementIgnoringVisibility", 64);
        this.f10107p = C1165d.d("imeAnimationTarget", 8);
        this.q = C1165d.d("imeAnimationSource", 8);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f10108r = bool != null ? bool.booleanValue() : true;
        this.f10110t = new RunnableC1149B(this);
    }

    public static void a(Z z3, C0521S c0521s) {
        boolean z4 = false;
        z3.f10092a.f(c0521s, 0);
        z3.f10094c.f(c0521s, 0);
        z3.f10093b.f(c0521s, 0);
        z3.f10096e.f(c0521s, 0);
        z3.f10097f.f(c0521s, 0);
        z3.f10098g.f(c0521s, 0);
        z3.f10099h.f(c0521s, 0);
        z3.f10100i.f(c0521s, 0);
        z3.f10095d.f(c0521s, 0);
        z3.f10102k.f(AbstractC1166e.e(c0521s.f7111a.g(4)));
        z3.f10103l.f(AbstractC1166e.e(c0521s.f7111a.g(2)));
        z3.f10104m.f(AbstractC1166e.e(c0521s.f7111a.g(1)));
        z3.f10105n.f(AbstractC1166e.e(c0521s.f7111a.g(7)));
        z3.f10106o.f(AbstractC1166e.e(c0521s.f7111a.g(64)));
        C0528e e3 = c0521s.f7111a.e();
        if (e3 != null) {
            z3.f10101j.f(AbstractC1166e.e(Build.VERSION.SDK_INT >= 30 ? W0.b.c(AbstractC0527d.b(e3.f7119a)) : W0.b.f5890e));
        }
        synchronized (T.n.f5710b) {
            C0736B c0736b = ((C0374b) T.n.f5717i.get()).f5673h;
            if (c0736b != null) {
                if (c0736b.h()) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            T.n.a();
        }
    }
}
