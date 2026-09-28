package b;

import B1.C;
import J.W0;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6990a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6991b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6992c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6993d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f6994e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f6995f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6996g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0489m f6997h;

    public C0487k(AbstractActivityC0489m abstractActivityC0489m) {
        this.f6997h = abstractActivityC0489m;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        String str = (String) this.f6990a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        e.b bVar = (e.b) this.f6994e.get(str);
        if ((bVar != null ? bVar.f7537a : null) != null) {
            ArrayList arrayList = this.f6993d;
            if (arrayList.contains(str)) {
                ((y2.c) ((W0) bVar.f7537a.f677h).getValue()).l(bVar.f7538b.g0(intent, i3));
                arrayList.remove(str);
                return true;
            }
        }
        this.f6995f.remove(str);
        this.f6996g.putParcelable(str, new e.a(intent, i3));
        return true;
    }

    public final void b(int i2, C c3, Serializable serializable) {
        Bundle bundle;
        z2.h.f(c3, "contract");
        AbstractActivityC0489m abstractActivityC0489m = this.f6997h;
        N.e Y2 = c3.Y(abstractActivityC0489m, serializable);
        if (Y2 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0486j(i2, 0, this, Y2));
            return;
        }
        Intent N3 = c3.N(abstractActivityC0489m, serializable);
        if (N3.getExtras() != null) {
            Bundle extras = N3.getExtras();
            z2.h.c(extras);
            if (extras.getClassLoader() == null) {
                N3.setExtrasClassLoader(abstractActivityC0489m.getClassLoader());
            }
        }
        if (N3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = N3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            N3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!z2.h.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", N3.getAction())) {
            if (!z2.h.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", N3.getAction())) {
                abstractActivityC0489m.startActivityForResult(N3, i2, bundle);
                return;
            }
            e.f fVar = (e.f) N3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                z2.h.c(fVar);
                abstractActivityC0489m.startIntentSenderForResult(fVar.f7543h, i2, fVar.f7544i, fVar.f7545j, fVar.f7546k, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e3) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0486j(i2, 1, this, e3));
                return;
            }
        }
        String[] stringArrayExtra = N3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        T0.a.b(abstractActivityC0489m, stringArrayExtra, i2);
    }
}
