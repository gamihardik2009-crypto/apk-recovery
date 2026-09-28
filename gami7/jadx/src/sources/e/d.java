package e;

import B1.C;
import B1.t;
import a.AbstractC0423a;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b.C0487k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import z2.h;

/* loaded from: classes.dex */
public final class d extends AbstractC0423a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0487k f7540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f7541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C f7542i;

    public d(C0487k c0487k, String str, C c3) {
        this.f7540g = c0487k;
        this.f7541h = str;
        this.f7542i = c3;
    }

    @Override // a.AbstractC0423a
    public final void R(Serializable serializable) {
        C0487k c0487k = this.f7540g;
        LinkedHashMap linkedHashMap = c0487k.f6991b;
        String str = this.f7541h;
        Object obj = linkedHashMap.get(str);
        C c3 = this.f7542i;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c3 + " and input " + serializable + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj).intValue();
        ArrayList arrayList = c0487k.f6993d;
        arrayList.add(str);
        try {
            c0487k.b(intValue, c3, serializable);
        } catch (Exception e3) {
            arrayList.remove(str);
            throw e3;
        }
    }

    @Override // a.AbstractC0423a
    public final void d0() {
        Object parcelable;
        Integer num;
        C0487k c0487k = this.f7540g;
        c0487k.getClass();
        String str = this.f7541h;
        h.f(str, "key");
        if (!c0487k.f6993d.contains(str) && (num = (Integer) c0487k.f6991b.remove(str)) != null) {
            c0487k.f6990a.remove(num);
        }
        c0487k.f6994e.remove(str);
        LinkedHashMap linkedHashMap = c0487k.f6995f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = c0487k.f6996g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = Y0.b.a(bundle, str, a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) parcelable));
            bundle.remove(str);
        }
        t.w(c0487k.f6992c.get(str));
    }
}
