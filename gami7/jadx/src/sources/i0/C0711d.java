package i0;

import c0.C0578S;
import c0.C0603v;
import java.util.ArrayList;
import n2.AbstractC0946A;
import n2.C0970v;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7858a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7859b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7860c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7861d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7862e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7863f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7864g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7865h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7866i;

    /* renamed from: j, reason: collision with root package name */
    public final C0710c f7867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7868k;

    public C0711d(String str, boolean z3) {
        long j3 = C0603v.f7277g;
        this.f7858a = str;
        this.f7859b = 24.0f;
        this.f7860c = 24.0f;
        this.f7861d = 24.0f;
        this.f7862e = 24.0f;
        this.f7863f = j3;
        this.f7864g = 5;
        this.f7865h = z3;
        ArrayList arrayList = new ArrayList();
        this.f7866i = arrayList;
        int i2 = AbstractC0732y.f7958a;
        C0970v c0970v = C0970v.f9165h;
        ArrayList arrayList2 = new ArrayList();
        C0710c c0710c = new C0710c();
        c0710c.f7848a = "";
        c0710c.f7849b = 0.0f;
        c0710c.f7850c = 0.0f;
        c0710c.f7851d = 0.0f;
        c0710c.f7852e = 1.0f;
        c0710c.f7853f = 1.0f;
        c0710c.f7854g = 0.0f;
        c0710c.f7855h = 0.0f;
        c0710c.f7856i = c0970v;
        c0710c.f7857j = arrayList2;
        this.f7867j = c0710c;
        arrayList.add(c0710c);
    }

    public static void a(C0711d c0711d, ArrayList arrayList, C0578S c0578s) {
        if (!(!c0711d.f7868k)) {
            AbstractC0946A.r("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ((C0710c) c0711d.f7866i.get(r0.size() - 1)).f7857j.add(new C0707B("", arrayList, 0, c0578s, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0712e b() {
        int i2 = 1;
        if (!(!this.f7868k)) {
            AbstractC0946A.r("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.f7866i;
            if (arrayList.size() <= i2) {
                C0710c c0710c = this.f7867j;
                C0712e c0712e = new C0712e(this.f7858a, this.f7859b, this.f7860c, this.f7861d, this.f7862e, new C0731x(c0710c.f7848a, c0710c.f7849b, c0710c.f7850c, c0710c.f7851d, c0710c.f7852e, c0710c.f7853f, c0710c.f7854g, c0710c.f7855h, c0710c.f7856i, c0710c.f7857j), this.f7863f, this.f7864g, this.f7865h);
                this.f7868k = true;
                return c0712e;
            }
            if (((this.f7868k ? 1 : 0) ^ i2) == 0) {
                AbstractC0946A.r("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C0710c c0710c2 = (C0710c) arrayList.remove(arrayList.size() - i2);
            ((C0710c) arrayList.get(arrayList.size() - i2)).f7857j.add(new C0731x(c0710c2.f7848a, c0710c2.f7849b, c0710c2.f7850c, c0710c2.f7851d, c0710c2.f7852e, c0710c2.f7853f, c0710c2.f7854g, c0710c2.f7855h, c0710c2.f7856i, c0710c2.f7857j));
            i2 = 1;
        }
    }
}
