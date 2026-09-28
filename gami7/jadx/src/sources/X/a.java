package X;

import A0.q;
import A0.t;
import B1.C;
import C0.C0024g;
import C1.z;
import D0.k;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import u0.Q0;
import z2.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6179a = new a();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(X.c r6, android.util.LongSparseArray r7) {
        /*
            r0 = 0
        L1:
            int r1 = r7.size()
            if (r0 >= r1) goto L59
            int r1 = r0 + 1
            long r2 = r7.keyAt(r0)
            java.lang.Object r0 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r0 = D0.k.j(r0)
            if (r0 == 0) goto L57
            android.view.translation.TranslationResponseValue r0 = D0.k.g(r0)
            if (r0 == 0) goto L57
            java.lang.CharSequence r0 = D0.k.k(r0)
            if (r0 == 0) goto L57
            j.q r4 = r6.g()
            int r2 = (int) r2
            java.lang.Object r2 = r4.e(r2)
            u0.Q0 r2 = (u0.Q0) r2
            if (r2 == 0) goto L57
            A0.q r2 = r2.f10968a
            if (r2 == 0) goto L57
            A0.x r3 = A0.j.f44j
            A0.k r2 = r2.f72d
            java.lang.Object r2 = B1.C.T(r2, r3)
            A0.a r2 = (A0.a) r2
            if (r2 == 0) goto L57
            m2.c r2 = r2.f17b
            y2.c r2 = (y2.c) r2
            if (r2 == 0) goto L57
            C0.g r3 = new C0.g
            java.lang.String r0 = r0.toString()
            r4 = 6
            r5 = 0
            r3.<init>(r0, r5, r4)
            java.lang.Object r0 = r2.l(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L57:
            r0 = r1
            goto L1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.a.a(X.c, android.util.LongSparseArray):void");
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        q qVar;
        String Q3;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j3 : jArr) {
            Q0 q0 = (Q0) cVar.g().e((int) j3);
            if (q0 != null && (qVar = q0.f10968a) != null) {
                k.l();
                ViewTranslationRequest.Builder h2 = k.h(cVar.f6185h.getAutofillId(), qVar.f75g);
                List list = (List) C.T(qVar.f72d, t.f114u);
                if (list != null && (Q3 = C.Q(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new C0024g(Q3, null, 6));
                    h2.setValue("android:text", forText);
                    build = h2.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(c cVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (h.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f6185h.post(new z(cVar, 5, longSparseArray));
        }
    }
}
