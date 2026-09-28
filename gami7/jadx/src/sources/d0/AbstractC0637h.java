package d0;

import j.AbstractC0754j;
import j.C0761q;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0637h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0761q f7426a;

    static {
        C0646q c0646q = C0633d.f7401c;
        int i2 = c0646q.f7398c;
        C0634e c0634e = new C0634e(c0646q, c0646q, 1);
        C0641l c0641l = C0633d.f7417t;
        int i3 = c0641l.f7398c << 6;
        int i4 = c0646q.f7398c;
        int i5 = i3 | i4;
        C0636g c0636g = new C0636g(c0646q, c0641l, 0);
        int i6 = (i4 << 6) | c0641l.f7398c;
        C0636g c0636g2 = new C0636g(c0641l, c0646q, 0);
        C0761q c0761q = AbstractC0754j.f8005a;
        C0761q c0761q2 = new C0761q();
        c0761q2.g(i2 | (i2 << 6), c0634e);
        c0761q2.g(i5, c0636g);
        c0761q2.g(i6, c0636g2);
        f7426a = c0761q2;
    }
}
