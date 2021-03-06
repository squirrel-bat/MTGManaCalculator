package unii.mtg.mana.calculator.view.fragment;

import android.content.Context;
import androidx.fragment.app.Fragment;
import android.text.InputType;

import com.afollestad.materialdialogs.MaterialDialog;

import unii.mtg.mana.calculator.R;

public class BaseFragment extends Fragment {


    protected MaterialDialog showInputDialog(Context context, String title, String content, String hint, String lastValue, MaterialDialog.InputCallback inputCallback) {
        return new MaterialDialog.Builder(context).
                title(title).content(content).inputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED)
                .backgroundColorRes(R.color.windowBackground).input(hint, lastValue, inputCallback)
                .show();

    }


    protected MaterialDialog showInfoDialog(Context context, String title, String content, String positiveButtonText) {
        return new MaterialDialog.Builder(context)
                .title(title)
                .content(content).backgroundColorRes(R.color.windowBackground)
                .positiveText(positiveButtonText)
                .show();
    }
}
