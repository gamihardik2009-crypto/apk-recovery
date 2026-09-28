package T;

import J.C0257c;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5726a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5727b = new Object();

    public static final void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final int b(int[] iArr, int i2) {
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else {
                if (i2 >= i5) {
                    return i4;
                }
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static AbstractC0379g c() {
        return (AbstractC0379g) n.f5709a.d();
    }

    public static AbstractC0379g d(AbstractC0379g abstractC0379g) {
        if (abstractC0379g instanceof F) {
            F f3 = (F) abstractC0379g;
            if (f3.f5660t == C0257c.C()) {
                f3.f5658r = null;
                return abstractC0379g;
            }
        }
        if (abstractC0379g instanceof G) {
            G g3 = (G) abstractC0379g;
            if (g3.f5665i == C0257c.C()) {
                g3.f5664h = null;
                return abstractC0379g;
            }
        }
        AbstractC0379g h2 = n.h(abstractC0379g, null, false);
        h2.j();
        return h2;
    }

    public static Object e(y2.c cVar, y2.a aVar) {
        AbstractC0379g f3;
        if (cVar == null) {
            return aVar.c();
        }
        AbstractC0379g abstractC0379g = (AbstractC0379g) n.f5709a.d();
        if (abstractC0379g instanceof F) {
            F f4 = (F) abstractC0379g;
            if (f4.f5660t == C0257c.C()) {
                y2.c cVar2 = f4.f5658r;
                y2.c cVar3 = f4.f5659s;
                try {
                    ((F) abstractC0379g).f5658r = n.l(cVar, cVar2, true);
                    ((F) abstractC0379g).f5659s = n.b(null, cVar3);
                    return aVar.c();
                } finally {
                    f4.f5658r = cVar2;
                    f4.f5659s = cVar3;
                }
            }
        }
        if (abstractC0379g == null || (abstractC0379g instanceof C0375c)) {
            f3 = new F(abstractC0379g instanceof C0375c ? (C0375c) abstractC0379g : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.c();
            }
            f3 = abstractC0379g.t(cVar);
        }
        try {
            AbstractC0379g j3 = f3.j();
            try {
                return aVar.c();
            } finally {
                AbstractC0379g.p(j3);
            }
        } finally {
            f3.c();
        }
    }

    public static void f(AbstractC0379g abstractC0379g, AbstractC0379g abstractC0379g2, y2.c cVar) {
        if (abstractC0379g != abstractC0379g2) {
            abstractC0379g2.getClass();
            AbstractC0379g.p(abstractC0379g);
            abstractC0379g2.c();
        } else if (abstractC0379g instanceof F) {
            ((F) abstractC0379g).f5658r = cVar;
        } else if (abstractC0379g instanceof G) {
            ((G) abstractC0379g).f5664h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0379g).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
