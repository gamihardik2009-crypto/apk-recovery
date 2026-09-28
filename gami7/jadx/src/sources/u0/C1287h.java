package u0;

import C0.C0022e;
import C0.C0024g;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import c0.C0575O;
import c0.C0603v;
import java.util.List;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287h implements InterfaceC1288h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f11055a;

    public C1287h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        z2.h.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f11055a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C0024g c0024g) {
        boolean isEmpty = c0024g.a().isEmpty();
        String str = c0024g.f500a;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            C1298m0 c1298m0 = new C1298m0();
            c1298m0.f11113a = Parcel.obtain();
            List a3 = c0024g.a();
            int size = a3.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0022e c0022e = (C0022e) a3.get(i2);
                C0.C c3 = (C0.C) c0022e.f496a;
                c1298m0.f11113a.recycle();
                c1298m0.f11113a = Parcel.obtain();
                long b3 = c3.f427a.b();
                long j3 = C0603v.f7277g;
                if (!C0603v.c(b3, j3)) {
                    c1298m0.b((byte) 1);
                    c1298m0.f11113a.writeLong(c3.f427a.b());
                }
                long j4 = O0.m.f5153c;
                long j5 = c3.f428b;
                byte b4 = 2;
                if (!O0.m.a(j5, j4)) {
                    c1298m0.b((byte) 2);
                    c1298m0.d(j5);
                }
                H0.k kVar = c3.f429c;
                if (kVar != null) {
                    c1298m0.b((byte) 3);
                    c1298m0.f11113a.writeInt(kVar.f3405h);
                }
                H0.i iVar = c3.f430d;
                if (iVar != null) {
                    c1298m0.b((byte) 4);
                    int i3 = iVar.f3398a;
                    c1298m0.b((!H0.i.a(i3, 0) && H0.i.a(i3, 1)) ? (byte) 1 : (byte) 0);
                }
                H0.j jVar = c3.f431e;
                if (jVar != null) {
                    c1298m0.b((byte) 5);
                    int i4 = jVar.f3399a;
                    if (!H0.j.a(i4, 0)) {
                        if (H0.j.a(i4, 1)) {
                            b4 = 1;
                        } else if (!H0.j.a(i4, 2)) {
                            if (H0.j.a(i4, 3)) {
                                b4 = 3;
                            }
                        }
                        c1298m0.b(b4);
                    }
                    b4 = 0;
                    c1298m0.b(b4);
                }
                String str2 = c3.f433g;
                if (str2 != null) {
                    c1298m0.b((byte) 6);
                    c1298m0.f11113a.writeString(str2);
                }
                long j6 = c3.f434h;
                if (!O0.m.a(j6, j4)) {
                    c1298m0.b((byte) 7);
                    c1298m0.d(j6);
                }
                N0.a aVar = c3.f435i;
                if (aVar != null) {
                    c1298m0.b((byte) 8);
                    c1298m0.c(aVar.f4976a);
                }
                N0.n nVar = c3.f436j;
                if (nVar != null) {
                    c1298m0.b((byte) 9);
                    c1298m0.c(nVar.f5000a);
                    c1298m0.c(nVar.f5001b);
                }
                long j7 = c3.f438l;
                if (!C0603v.c(j7, j3)) {
                    c1298m0.b((byte) 10);
                    c1298m0.f11113a.writeLong(j7);
                }
                N0.j jVar2 = c3.f439m;
                if (jVar2 != null) {
                    c1298m0.b((byte) 11);
                    c1298m0.f11113a.writeInt(jVar2.f4996a);
                }
                C0575O c0575o = c3.f440n;
                if (c0575o != null) {
                    c1298m0.b((byte) 12);
                    c1298m0.f11113a.writeLong(c0575o.f7220a);
                    long j8 = c0575o.f7221b;
                    c1298m0.c(b0.c.d(j8));
                    c1298m0.c(b0.c.e(j8));
                    c1298m0.c(c0575o.f7222c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(c1298m0.f11113a.marshall(), 0)), c0022e.f497b, c0022e.f498c, 33);
            }
            str = spannableString;
        }
        this.f11055a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
